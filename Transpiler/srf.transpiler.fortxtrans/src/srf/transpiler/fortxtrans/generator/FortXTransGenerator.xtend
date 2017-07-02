/*
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package srf.transpiler.fortxtrans.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.naming.IQualifiedNameProvider
import javax.inject.Inject
import srf.transpiler.fortxtrans.fortXTrans.Component
import srf.transpiler.fortxtrans.fortXTrans.Import
import srf.transpiler.fortxtrans.fortXTrans.Export
import srf.transpiler.fortxtrans.fortXTrans.Decls
import srf.transpiler.fortxtrans.fortXTrans.Decl
import srf.transpiler.fortxtrans.fortXTrans.FnDecl
import srf.transpiler.fortxtrans.fortXTrans.ValParam
import srf.transpiler.fortxtrans.fortXTrans.FieldDecl
import srf.transpiler.fortxtrans.fortXTrans.LocalVarDecl
import srf.transpiler.fortxtrans.fortXTrans.Do
import srf.transpiler.fortxtrans.fortXTrans.DoFront
import srf.transpiler.fortxtrans.fortXTrans.BlockElems
import srf.transpiler.fortxtrans.fortXTrans.DelimitedExpr
import srf.transpiler.fortxtrans.fortXTrans.Expr
import srf.transpiler.fortxtrans.fortXTrans.Stmnts
import srf.transpiler.fortxtrans.fortXTrans.Stmnt
import srf.transpiler.fortxtrans.fortXTrans.BlockElem
import srf.transpiler.fortxtrans.fortXTrans.AddExpr
import srf.transpiler.fortxtrans.fortXTrans.LiteralTuple
import srf.transpiler.fortxtrans.fortXTrans.QualifiedName
import srf.transpiler.fortxtrans.fortXTrans.SubExpr
import srf.transpiler.fortxtrans.fortXTrans.DivExpr
import srf.transpiler.fortxtrans.fortXTrans.MultExpr
import srf.transpiler.fortxtrans.fortXTrans.FCall
import srf.transpiler.fortxtrans.fortXTrans.ExponentExpr
import srf.transpiler.fortxtrans.fortXTrans.ExprList
import srf.transpiler.fortxtrans.fortXTrans.Not
import srf.transpiler.fortxtrans.fortXTrans.Paran
import srf.transpiler.fortxtrans.fortXTrans.DelimitedExprList
import srf.transpiler.fortxtrans.fortXTrans.QualifiedNameTuple
import srf.transpiler.fortxtrans.fortXTrans.Literal
import srf.transpiler.fortxtrans.fortXTrans.Qualified
import srf.transpiler.fortxtrans.fortXTrans.LiteralTup
import srf.transpiler.fortxtrans.fortXTrans.LiteralList
import srf.transpiler.fortxtrans.fortXTrans.IntConst
import srf.transpiler.fortxtrans.fortXTrans.FloatConst
import srf.transpiler.fortxtrans.fortXTrans.StrConst
import srf.transpiler.fortxtrans.fortXTrans.BoolConst

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class FortXTransGenerator extends AbstractGenerator {
	
	def String remlast(String s){
		return s.substring(0, s.length-1)
	}

	 @Inject extension IQualifiedNameProvider
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(c: resource.allContents.toIterable.filter(Component)){
			fsa.generateFile(
                c.fullyQualifiedName.toString("/") + ".x10",
                c.compile)
		}
	}
	
	def String compile(Component c)'''
		import x10.io.Console;
		import x10.lang.Math;
		import x10.array.Array_1;
		import x10.array.Array_2;
		import x10.array.Array_3;
		/*needs to import
		«FOR i:c.imports»
			«i.compile»
		«ENDFOR»
		*/
		/*exports
		«FOR e:c.exports»
			«e.compile»
		«ENDFOR»
		*/
		
		public class «c.name»{
			public static def println[T](x:T){
				return Console.OUT.println(x);
			}
			
			public static def nanoTime(){
				return System.nanoTime();
			}
			
			
			«FOR d:c.decls»
				«d.compile»
			«ENDFOR»
		}
	'''
	
	def compile(Import i)'''
		«IF i.api===null»
			«i.imps» «i.importedNames.impname
			»«IF i.importedNames.asname!==null
				»as «i.importedNames.asname
			»«ELSE
				»«IF i.importedNames.simpList.length !=0
				».{«
					FOR s:0..<(i.importedNames.simpList.length)
						»«IF s===0»«
							i.importedNames.simpList.get(s).orig
						»«ELSE
							», «i.importedNames.simpList.get(s).orig
						»«ENDIF
				
						»«IF i.importedNames.simpList.get(s).asName!==null
							» as «i.importedNames.simpList.get(s).asName
						»«ENDIF
					»«ENDFOR
					»«IF i.importedNames.comma
						» , ... «
					ENDIF
				»}«
				ELSE».{...}«
					IF i.importedNames.except
						» except «
						IF i.importedNames.simp.brack!==null
							»{«
							FOR s:0..<(i.importedNames.simp.nameList.length)
								»«IF s==0»«
									i.importedNames.simp.nameList.get(s).name
								»«ELSE
									», «i.importedNames.simp.nameList.get(s).name
								»«ENDIF
							»«ENDFOR
							»}«
						ELSE
							»«i.importedNames.simp.nameList.get(0).name
						»«ENDIF
					»«ENDIF
				»«ENDIF
			»«ENDIF
		»«ELSE»
			«i.imps» «i.api 
			» «IF i.aliasedimportedNames.brack!==null
				»{«
				FOR s:0..<(i.aliasedimportedNames.nameList.length)
					»«IF s==0
						»«i.aliasedimportedNames.nameList.get(0).orig
					»«ELSE
						», «i.aliasedimportedNames.nameList.get(0).orig
					»«ENDIF
					
					»«IF i.aliasedimportedNames.nameList.get(s).asName!==null
						» as «i.aliasedimportedNames.nameList.get(0).asName
					»«ENDIF
				»«ENDFOR
				»}«
			ELSE
				»«i.aliasedimportedNames.nameList.get(0).orig
				»«IF i.aliasedimportedNames.nameList.get(0).asName!==null
					» as «i.aliasedimportedNames.nameList.get(0).asName
				»«ENDIF
			»«ENDIF
		»«ENDIF»
	'''
	
	def compile(Export e)'''
		«e.exp
		» «IF e.brack!==null
			»{«
			FOR k:0..<(e.exportedName.length)
				»«IF k==0
					»«e.exportedName.get(k).compile
				»«ELSE
					», «e.exportedName.get(k).compile
				»«ENDIF
			»«ENDFOR
			»}«
		ELSE
			»«e.exportedName.get(0)
		»«ENDIF»
	'''
	
	def compile(QualifiedName q){
		var s = ''''''
		if(q.s.length==1)
			s = s+q.s.get(0).name
		else{
			s = s+q.s.get(0).name
			for(ss:1..<q.s.length)
				s=s+"."+q.s.get(ss).name
		}
		if(q.dots!==null)
			s=s+q.dots
		return s
	}
	
	def compile(ValParam p)
	'''«IF p.params.length==0
		»«
	ELSE»«
		IF p.brack===null
			»«p.params.get(0)»«
		ELSE»«
			FOR s:0..<p.params.length»«
				IF s==0»
					«p.params.get(s).parId.compile»:«
				ELSE
					», «p.params.get(s).parId.compile
				»:«ENDIF»«
				IF p.params.get(s).istype.type.name=="ZZ32"
					»Int«
				ELSE»«
					IF p.params.get(s).istype.type.name=="ZZ64"
						»Long«
					ELSE»«
						IF p.params.get(s).istype.type.name=="RR32"
							»Float«
						ELSE»«
							IF p.params.get(s).istype.type.name=="RR64"
								»Double«
							ELSE»«
								IF p.params.get(s).istype.type.name=="String"
									»String«
								ELSE»«
									p.params.get(s).istype.type.name									
								»«ENDIF
							»«ENDIF
						»«ENDIF
					»«ENDIF
				»«ENDIF
			»«ENDFOR
		»«ENDIF
	»«ENDIF»'''
	
	def compile(Decls d)'''
		«FOR dec:d.decls»
			«dec.compile»
		«ENDFOR»
	'''
	
	def compile(Decl d)'''
		«IF d.function!==null»
			«d.function.compile»
		«ELSE» «IF d.field!==null»
			«d.field.compile»
			«ENDIF»
		«ENDIF»
	'''
	
	def compile(FieldDecl f){
		var s = ""
		if(f.vars!==null)
		{
			if(f.vars.single!==null){
				if(f.pri!==null)
					s = s + '''private '''
				if(f.mut===null)
					s = s + '''static val '''
				else
					s = s + '''var '''
				s = s + f.vars.single.bid.compile+":"
				var type = f.vars.single.istype.type.name
				if(type=="ZZ32")
					s=s+'''Int = '''+f.init.compile+" as Int;"
				else if(type=="ZZ64")
					s=s+'''Long = '''+f.init.compile+" as Long;"
				else if(type=="RR32")
					s=s+'''Float = '''+f.init.compile+" as Float;"
				else if(type=="RR64")
					s=s+'''Double = '''+f.init.compile+" as Double;"
				else if(type=="String")
					s=s+'''String = '''+f.init.compile+";"
				else{
					s = s+ type + "= " + f.init.compile+";";		
				}
			}
			else{
				var attach = f.init.compile.split(",")
				for(m:0..<f.vars.multiple.length){
					if(f.pri!==null)
						s = s + '''private '''
					if(f.mut===null)
						s = s + '''static val '''
					else
						s = s + '''var '''
					s = s + f.vars.multiple.get(m).bid.compile+":"
					var type = f.vars.multiple.get(m).istype.type.name
					if(type=="ZZ32")
						s=s+'''Int = '''+ attach.get(m)+" as Int;"
					else if(type=="ZZ64")
						s=s+'''Long = ''' + attach.get(m)+" as Long;"
					else if(type=="RR32")
							s=s+'''Float = ''' + attach.get(m)+" as Float;"
					else if(type=="RR64")
						s=s+'''Double = ''' + attach.get(m)+" as Double;"
					else if(type=="String")
						s=s+'''String = '''+ attach.get(m)+";"
					else{
						s = s+ type + "= " + attach.get(m)+";";	
					}
					s = s+"\n"
				}
			}
		}
		else if(f.type!==null){
			var vars = f.idtup.compile.split(",")
			if(vars.length==1)
				s = s+"yolo"
		}
		return s
	}
	
	
	def String compile(LiteralTuple lt){
		switch(lt){
			Qualified: return lt.compile
			LiteralTup: return lt.compile
		}
	}
	
	def String compile(Qualified q){
		switch(q){
			QualifiedName: return q.compile
			QualifiedNameTuple: return q.compile
		}
	}
	
	def String compile(QualifiedNameTuple qt){
		var s = ""
		s = s + qt.qlist.get(0).compile
		for(q:1..<qt.qlist.length)
			s = s + "," + qt.qlist.get(q).compile
		return s
	}
	
	def String compile(LiteralTup lt){
		switch(lt){
			Literal: return lt.compile
			LiteralList: return lt.compile
		}
	}
	
	def String compile(Literal l){
		switch(l){
			IntConst: return l.value.toString+"n"
			FloatConst: return l.value.toString+"f"
			StrConst: return "\""+l.value+"\""
			BoolConst: return l.value
		}
	}
	
	def String compile(LiteralList ll){
		var s = ""
		s = s + ll.lit.get(0).compile
		for(l:1..<ll.lit.length)
			s = s + "," + ll.lit.get(l).compile
		return s
	}
	
	def compile(FnDecl f)'''
	//FnDecl
	«IF f.body»
	«f.fnItself.compile»
	«ENDIF»'''
	
	def String compile(Stmnts st)'''
	//Statements
	«IF st.front!==null»«st.front.compile»«
	ELSE»«IF st.locVar!==null»«st.locVar.compile»«
	ELSE»
	«IF st.exp!==null»«st.exp.compile
	»«ENDIF»
	«ENDIF»«ENDIF»
	'''
	
	def compile(Stmnt s){
		if(s.delim!==null)
			return s.delim.compile
		else
			return s.delims.compile
	}
	
	def compile(DelimitedExprList d){
		var s = ""
		for(dd:d.delim)
			s=s+'''{
					«dd.compile»
				}'''		
		return s
	}
	
	def compile(DelimitedExpr d)'''
	//DelimExpr«d.dod.compile»
	'''
	
	def compile(Do d)'''
	//Do«d.dofs.get(0).compile»
	'''
	
	def compile(DoFront df)'''
	//DoFront«df.block.compile»
	'''
	
	def compile(BlockElems bs)'''
	//BlockElems
	«FOR b:bs.block»
	«b.compile»
	«ENDFOR»
	'''
	
	def compile (BlockElem b)'''
	//BlockElem«b.st.compile»
	'''
	
	def compile(LocalVarDecl d)'''
	//LocalVar «d.init.compile»
	'''
	
	def String compile(Expr e){
		var s = ""
		switch(e){
			AddExpr: s = s+'''(«e.left.compile»+«e.right.compile»)'''
			SubExpr: s = s+'''(«e.left.compile»-«e.right.compile»)'''
			DivExpr: s = s+'''(«e.left.compile»/«e.right.compile»)'''
			MultExpr: s = s+'''(«e.left.compile»*«e.right.compile»)'''
			ExponentExpr: s = s+'''(Math.pow(«e.left.compile»,«e.right.compile»))'''
			Not:s=s+"!"+e.expression.compile
			Paran:s=s+'''(«e.exp.compile»)'''
			FCall:s=s+'''yolo(«IF e.right!==null»«e.right.exps.compile»«ENDIF»)'''
			LiteralTuple: s= s+e.compile
		}
		return s
	}
	
	def compile(ExprList e){
		var s = "name, name"
					
		return s
	}
   
}