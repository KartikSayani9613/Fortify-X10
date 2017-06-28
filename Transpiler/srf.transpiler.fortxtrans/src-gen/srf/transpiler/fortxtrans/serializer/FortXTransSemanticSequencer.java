/*
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package srf.transpiler.fortxtrans.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import srf.transpiler.fortxtrans.fortXTrans.API;
import srf.transpiler.fortxtrans.fortXTrans.AliasedAPIName;
import srf.transpiler.fortxtrans.fortXTrans.AliasedAPINames;
import srf.transpiler.fortxtrans.fortXTrans.AliasedSimpleName;
import srf.transpiler.fortxtrans.fortXTrans.Binding;
import srf.transpiler.fortxtrans.fortXTrans.BlockElems;
import srf.transpiler.fortxtrans.fortXTrans.Component;
import srf.transpiler.fortxtrans.fortXTrans.Decl;
import srf.transpiler.fortxtrans.fortXTrans.Decls;
import srf.transpiler.fortxtrans.fortXTrans.DelimitedExpr;
import srf.transpiler.fortxtrans.fortXTrans.Do;
import srf.transpiler.fortxtrans.fortXTrans.DoFront;
import srf.transpiler.fortxtrans.fortXTrans.Elif;
import srf.transpiler.fortxtrans.fortXTrans.Elifs;
import srf.transpiler.fortxtrans.fortXTrans.Else;
import srf.transpiler.fortxtrans.fortXTrans.Export;
import srf.transpiler.fortxtrans.fortXTrans.Expr;
import srf.transpiler.fortxtrans.fortXTrans.ExprFront;
import srf.transpiler.fortxtrans.fortXTrans.ExprTail;
import srf.transpiler.fortxtrans.fortXTrans.Expression;
import srf.transpiler.fortxtrans.fortXTrans.FnDecl;
import srf.transpiler.fortxtrans.fortXTrans.FnMod;
import srf.transpiler.fortxtrans.fortXTrans.FnMods;
import srf.transpiler.fortxtrans.fortXTrans.FortXTransPackage;
import srf.transpiler.fortxtrans.fortXTrans.GenClause;
import srf.transpiler.fortxtrans.fortXTrans.Generators;
import srf.transpiler.fortxtrans.fortXTrans.IdOrTuple;
import srf.transpiler.fortxtrans.fortXTrans.Import;
import srf.transpiler.fortxtrans.fortXTrans.ImportedNames;
import srf.transpiler.fortxtrans.fortXTrans.IsType;
import srf.transpiler.fortxtrans.fortXTrans.Param;
import srf.transpiler.fortxtrans.fortXTrans.Paranthesized;
import srf.transpiler.fortxtrans.fortXTrans.RetType;
import srf.transpiler.fortxtrans.fortXTrans.SimpleName;
import srf.transpiler.fortxtrans.fortXTrans.SimpleNames;
import srf.transpiler.fortxtrans.fortXTrans.Type;
import srf.transpiler.fortxtrans.fortXTrans.ValParam;
import srf.transpiler.fortxtrans.services.FortXTransGrammarAccess;

@SuppressWarnings("all")
public class FortXTransSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FortXTransGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == FortXTransPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case FortXTransPackage.API:
				sequence_API(context, (API) semanticObject); 
				return; 
			case FortXTransPackage.ALIASED_API_NAME:
				sequence_AliasedAPIName(context, (AliasedAPIName) semanticObject); 
				return; 
			case FortXTransPackage.ALIASED_API_NAMES:
				sequence_AliasedAPINames(context, (AliasedAPINames) semanticObject); 
				return; 
			case FortXTransPackage.ALIASED_SIMPLE_NAME:
				sequence_AliasedSimpleName(context, (AliasedSimpleName) semanticObject); 
				return; 
			case FortXTransPackage.BINDING:
				sequence_Binding(context, (Binding) semanticObject); 
				return; 
			case FortXTransPackage.BLOCK_ELEMS:
				sequence_BlockElems(context, (BlockElems) semanticObject); 
				return; 
			case FortXTransPackage.COMPONENT:
				sequence_Component(context, (Component) semanticObject); 
				return; 
			case FortXTransPackage.DECL:
				sequence_Decl(context, (Decl) semanticObject); 
				return; 
			case FortXTransPackage.DECLS:
				sequence_Decls(context, (Decls) semanticObject); 
				return; 
			case FortXTransPackage.DELIMITED_EXPR:
				sequence_DelimitedExpr(context, (DelimitedExpr) semanticObject); 
				return; 
			case FortXTransPackage.DO:
				sequence_Do(context, (Do) semanticObject); 
				return; 
			case FortXTransPackage.DO_FRONT:
				sequence_DoFront(context, (DoFront) semanticObject); 
				return; 
			case FortXTransPackage.ELIF:
				sequence_Elif(context, (Elif) semanticObject); 
				return; 
			case FortXTransPackage.ELIFS:
				sequence_Elifs(context, (Elifs) semanticObject); 
				return; 
			case FortXTransPackage.ELSE:
				sequence_Else(context, (Else) semanticObject); 
				return; 
			case FortXTransPackage.EXPORT:
				sequence_Export(context, (Export) semanticObject); 
				return; 
			case FortXTransPackage.EXPR:
				sequence_Expr(context, (Expr) semanticObject); 
				return; 
			case FortXTransPackage.EXPR_FRONT:
				sequence_ExprFront(context, (ExprFront) semanticObject); 
				return; 
			case FortXTransPackage.EXPR_TAIL:
				sequence_ExprTail(context, (ExprTail) semanticObject); 
				return; 
			case FortXTransPackage.EXPRESSION:
				if (rule == grammarAccess.getBlockElemRule()) {
					sequence_BlockElem(context, (Expression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getExpressionRule()) {
					sequence_Expression(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case FortXTransPackage.FN_DECL:
				sequence_FnDecl(context, (FnDecl) semanticObject); 
				return; 
			case FortXTransPackage.FN_MOD:
				sequence_FnMod(context, (FnMod) semanticObject); 
				return; 
			case FortXTransPackage.FN_MODS:
				sequence_FnMods(context, (FnMods) semanticObject); 
				return; 
			case FortXTransPackage.GEN_CLAUSE:
				sequence_GenClause(context, (GenClause) semanticObject); 
				return; 
			case FortXTransPackage.GENERATORS:
				sequence_Generators(context, (Generators) semanticObject); 
				return; 
			case FortXTransPackage.ID_OR_TUPLE:
				sequence_IdOrTuple(context, (IdOrTuple) semanticObject); 
				return; 
			case FortXTransPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case FortXTransPackage.IMPORTED_NAMES:
				sequence_ImportedNames(context, (ImportedNames) semanticObject); 
				return; 
			case FortXTransPackage.IS_TYPE:
				sequence_IsType(context, (IsType) semanticObject); 
				return; 
			case FortXTransPackage.PARAM:
				sequence_Param(context, (Param) semanticObject); 
				return; 
			case FortXTransPackage.PARANTHESIZED:
				sequence_Paranthesized(context, (Paranthesized) semanticObject); 
				return; 
			case FortXTransPackage.RET_TYPE:
				sequence_RetType(context, (RetType) semanticObject); 
				return; 
			case FortXTransPackage.SIMPLE_NAME:
				sequence_SimpleName(context, (SimpleName) semanticObject); 
				return; 
			case FortXTransPackage.SIMPLE_NAMES:
				sequence_SimpleNames(context, (SimpleNames) semanticObject); 
				return; 
			case FortXTransPackage.TYPE:
				sequence_Type(context, (Type) semanticObject); 
				return; 
			case FortXTransPackage.VAL_PARAM:
				sequence_ValParam(context, (ValParam) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Model returns API
	 *     API returns API
	 *
	 * Constraint:
	 *     (name=ID imports+=Import*)
	 */
	protected void sequence_API(ISerializationContext context, API semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AliasedAPIName returns AliasedAPIName
	 *
	 * Constraint:
	 *     (orig=APIName asName=ID?)
	 */
	protected void sequence_AliasedAPIName(ISerializationContext context, AliasedAPIName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AliasedAPINames returns AliasedAPINames
	 *
	 * Constraint:
	 *     (nameList+=AliasedAPIName | (brack='{' nameList+=AliasedAPIName nameList+=AliasedAPIName*))
	 */
	protected void sequence_AliasedAPINames(ISerializationContext context, AliasedAPINames semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AliasedSimpleName returns AliasedSimpleName
	 *
	 * Constraint:
	 *     (orig=ID asName=ID?)
	 */
	protected void sequence_AliasedSimpleName(ISerializationContext context, AliasedSimpleName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Binding returns Binding
	 *
	 * Constraint:
	 *     (idtup=IdOrTuple expr=Expr)
	 */
	protected void sequence_Binding(ISerializationContext context, Binding semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FortXTransPackage.Literals.BINDING__IDTUP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FortXTransPackage.Literals.BINDING__IDTUP));
			if (transientValues.isValueTransient(semanticObject, FortXTransPackage.Literals.BINDING__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FortXTransPackage.Literals.BINDING__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBindingAccess().getIdtupIdOrTupleParserRuleCall_0_0(), semanticObject.getIdtup());
		feeder.accept(grammarAccess.getBindingAccess().getExprExprParserRuleCall_2_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     BlockElem returns Expression
	 *
	 * Constraint:
	 *     exp=Expr
	 */
	protected void sequence_BlockElem(ISerializationContext context, Expression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FortXTransPackage.Literals.EXPRESSION__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FortXTransPackage.Literals.EXPRESSION__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBlockElemAccess().getExpExprParserRuleCall_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     BlockElems returns BlockElems
	 *
	 * Constraint:
	 *     (block+=BlockElem block+=BlockElem*)
	 */
	protected void sequence_BlockElems(ISerializationContext context, BlockElems semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Component
	 *     Component returns Component
	 *
	 * Constraint:
	 *     (name=ID imports+=Import* exports+=Export+ decls+=Decls*)
	 */
	protected void sequence_Component(ISerializationContext context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Decl returns Decl
	 *
	 * Constraint:
	 *     function=FnDecl
	 */
	protected void sequence_Decl(ISerializationContext context, Decl semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FortXTransPackage.Literals.DECL__FUNCTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FortXTransPackage.Literals.DECL__FUNCTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDeclAccess().getFunctionFnDeclParserRuleCall_0(), semanticObject.getFunction());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Decls returns Decls
	 *
	 * Constraint:
	 *     decls+=Decl+
	 */
	protected void sequence_Decls(ISerializationContext context, Decls semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DelimitedExpr returns DelimitedExpr
	 *
	 * Constraint:
	 *     (
	 *         dod=Do | 
	 *         (awhile='while' expr=Expr whiledod=Do) | 
	 *         (afor='for' gen=Generators dofront=DoFront) | 
	 *         (anif='if' cond=Expr block=BlockElems elifs=Elifs? else=Else?) | 
	 *         par=Paranthesized
	 *     )
	 */
	protected void sequence_DelimitedExpr(ISerializationContext context, DelimitedExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DoFront returns DoFront
	 *
	 * Constraint:
	 *     ((at?='at' exp=Expr)? atom?='atomic'? block=BlockElems)
	 */
	protected void sequence_DoFront(ISerializationContext context, DoFront semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Do returns Do
	 *
	 * Constraint:
	 *     (dofs+=DoFront dofs+=DoFront*)
	 */
	protected void sequence_Do(ISerializationContext context, Do semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Elif returns Elif
	 *
	 * Constraint:
	 *     (expr=Expr block=BlockElems)
	 */
	protected void sequence_Elif(ISerializationContext context, Elif semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FortXTransPackage.Literals.ELIF__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FortXTransPackage.Literals.ELIF__EXPR));
			if (transientValues.isValueTransient(semanticObject, FortXTransPackage.Literals.ELIF__BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FortXTransPackage.Literals.ELIF__BLOCK));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getElifAccess().getExprExprParserRuleCall_1_0(), semanticObject.getExpr());
		feeder.accept(grammarAccess.getElifAccess().getBlockBlockElemsParserRuleCall_3_0(), semanticObject.getBlock());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Elifs returns Elifs
	 *
	 * Constraint:
	 *     (e+=Elif e+=Elif*)
	 */
	protected void sequence_Elifs(ISerializationContext context, Elifs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Else returns Else
	 *
	 * Constraint:
	 *     block=BlockElems
	 */
	protected void sequence_Else(ISerializationContext context, Else semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FortXTransPackage.Literals.ELSE__BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FortXTransPackage.Literals.ELSE__BLOCK));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getElseAccess().getBlockBlockElemsParserRuleCall_1_0(), semanticObject.getBlock());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Export returns Export
	 *
	 * Constraint:
	 *     ((exp='export' exportedName+=APIName) | (exp='export' brack='{' exportedName+=APIName exportedName+=APIName*))
	 */
	protected void sequence_Export(ISerializationContext context, Export semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExprFront returns ExprFront
	 *
	 * Constraint:
	 *     (delim=DelimitedExpr | id=QualifiedName)
	 */
	protected void sequence_ExprFront(ISerializationContext context, ExprFront semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExprTail returns ExprTail
	 *
	 * Constraint:
	 *     type=Type
	 */
	protected void sequence_ExprTail(ISerializationContext context, ExprTail semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FortXTransPackage.Literals.EXPR_TAIL__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FortXTransPackage.Literals.EXPR_TAIL__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExprTailAccess().getTypeTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expr returns Expr
	 *     Paranthesized.Paranthesized_2 returns Expr
	 *
	 * Constraint:
	 *     (front=ExprFront tails+=ExprTail*)
	 */
	protected void sequence_Expr(ISerializationContext context, Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Expression
	 *
	 * Constraint:
	 *     exp=Expr
	 */
	protected void sequence_Expression(ISerializationContext context, Expression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FortXTransPackage.Literals.EXPRESSION__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FortXTransPackage.Literals.EXPRESSION__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpressionAccess().getExpExprParserRuleCall_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FnDecl returns FnDecl
	 *
	 * Constraint:
	 *     (mods=FnMods? name=ID params=ValParam retVal=RetType? (body?='=' fnItself=Expression)?)
	 */
	protected void sequence_FnDecl(ISerializationContext context, FnDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FnMod returns FnMod
	 *
	 * Constraint:
	 *     (modtype='private' | modtype='test' | modtype='atomic' | modtype='io')
	 */
	protected void sequence_FnMod(ISerializationContext context, FnMod semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FnMods returns FnMods
	 *
	 * Constraint:
	 *     mods+=FnMod+
	 */
	protected void sequence_FnMods(ISerializationContext context, FnMods semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GenClause returns GenClause
	 *
	 * Constraint:
	 *     (binding=Binding | expr=Expr)
	 */
	protected void sequence_GenClause(ISerializationContext context, GenClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Generators returns Generators
	 *
	 * Constraint:
	 *     (binding=Binding clause+=GenClause*)
	 */
	protected void sequence_Generators(ISerializationContext context, Generators semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     IdOrTuple returns IdOrTuple
	 *
	 * Constraint:
	 *     (bid+=BindId | (bid+=BindId bid+=BindId*))
	 */
	protected void sequence_IdOrTuple(ISerializationContext context, IdOrTuple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     ((imps='import' importedNames=ImportedNames) | (imps='import' api='api' aliasedimportedNames=AliasedAPINames))
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ImportedNames returns ImportedNames
	 *
	 * Constraint:
	 *     (
	 *         (impname=APIName (except?='except' simp=SimpleNames)?) | 
	 *         (impname=APIName simpList+=AliasedSimpleName simpList+=AliasedSimpleName* (comma?=',' dots?=DOTS)?) | 
	 *         (impname=APIName asname=ID?)
	 *     )
	 */
	protected void sequence_ImportedNames(ISerializationContext context, ImportedNames semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     IsType returns IsType
	 *
	 * Constraint:
	 *     type=Type
	 */
	protected void sequence_IsType(ISerializationContext context, IsType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FortXTransPackage.Literals.IS_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FortXTransPackage.Literals.IS_TYPE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIsTypeAccess().getTypeTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Param returns Param
	 *
	 * Constraint:
	 *     (bId=BindId istype=IsType)
	 */
	protected void sequence_Param(ISerializationContext context, Param semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FortXTransPackage.Literals.PARAM__BID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FortXTransPackage.Literals.PARAM__BID));
			if (transientValues.isValueTransient(semanticObject, FortXTransPackage.Literals.PARAM__ISTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FortXTransPackage.Literals.PARAM__ISTYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParamAccess().getBIdBindIdParserRuleCall_0_0(), semanticObject.getBId());
		feeder.accept(grammarAccess.getParamAccess().getIstypeIsTypeParserRuleCall_1_0(), semanticObject.getIstype());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Paranthesized returns Paranthesized
	 *
	 * Constraint:
	 *     expr=Paranthesized_Paranthesized_2
	 */
	protected void sequence_Paranthesized(ISerializationContext context, Paranthesized semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FortXTransPackage.Literals.PARANTHESIZED__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FortXTransPackage.Literals.PARANTHESIZED__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParanthesizedAccess().getParanthesizedExprAction_2(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RetType returns RetType
	 *
	 * Constraint:
	 *     (empty='(' | type=Type)
	 */
	protected void sequence_RetType(ISerializationContext context, RetType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SimpleName returns SimpleName
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_SimpleName(ISerializationContext context, SimpleName semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FortXTransPackage.Literals.SIMPLE_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FortXTransPackage.Literals.SIMPLE_NAME__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSimpleNameAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SimpleNames returns SimpleNames
	 *
	 * Constraint:
	 *     (nameList+=SimpleName | (brack='{' nameList+=SimpleName nameList+=SimpleName*))
	 */
	protected void sequence_SimpleNames(ISerializationContext context, SimpleNames semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Type
	 *
	 * Constraint:
	 *     tname=ID
	 */
	protected void sequence_Type(ISerializationContext context, Type semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FortXTransPackage.Literals.TYPE__TNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FortXTransPackage.Literals.TYPE__TNAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypeAccess().getTnameIDTerminalRuleCall_0(), semanticObject.getTname());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ValParam returns ValParam
	 *
	 * Constraint:
	 *     (params+=Param | (brack='(' (params+=Param params+=Param*)?))
	 */
	protected void sequence_ValParam(ISerializationContext context, ValParam semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
