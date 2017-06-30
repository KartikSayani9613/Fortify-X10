/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package srf.transpiler.fortxtrans.fortXTrans.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import srf.transpiler.fortxtrans.fortXTrans.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FortXTransFactoryImpl extends EFactoryImpl implements FortXTransFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FortXTransFactory init()
  {
    try
    {
      FortXTransFactory theFortXTransFactory = (FortXTransFactory)EPackage.Registry.INSTANCE.getEFactory(FortXTransPackage.eNS_URI);
      if (theFortXTransFactory != null)
      {
        return theFortXTransFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FortXTransFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FortXTransFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case FortXTransPackage.MODEL: return createModel();
      case FortXTransPackage.COMPONENT: return createComponent();
      case FortXTransPackage.API: return createAPI();
      case FortXTransPackage.IMPORT: return createImport();
      case FortXTransPackage.EXPORT: return createExport();
      case FortXTransPackage.IMPORTED_NAMES: return createImportedNames();
      case FortXTransPackage.SIMPLE_NAMES: return createSimpleNames();
      case FortXTransPackage.SIMPLE_NAME: return createSimpleName();
      case FortXTransPackage.ALIASED_SIMPLE_NAME: return createAliasedSimpleName();
      case FortXTransPackage.ALIASED_API_NAMES: return createAliasedAPINames();
      case FortXTransPackage.ALIASED_API_NAME: return createAliasedAPIName();
      case FortXTransPackage.DECLS: return createDecls();
      case FortXTransPackage.DECL: return createDecl();
      case FortXTransPackage.FN_MODS: return createFnMods();
      case FortXTransPackage.FN_MOD: return createFnMod();
      case FortXTransPackage.VAL_PARAM: return createValParam();
      case FortXTransPackage.PARAM: return createParam();
      case FortXTransPackage.RET_TYPE: return createRetType();
      case FortXTransPackage.TUPLE_TYPE: return createTupleType();
      case FortXTransPackage.TYPE: return createType();
      case FortXTransPackage.FN_DECL: return createFnDecl();
      case FortXTransPackage.STMNT: return createStmnt();
      case FortXTransPackage.EXPR: return createExpr();
      case FortXTransPackage.EXPR_FRONT: return createExprFront();
      case FortXTransPackage.EXPR_TAIL: return createExprTail();
      case FortXTransPackage.DELIMITED_EXPR: return createDelimitedExpr();
      case FortXTransPackage.EXPR_LIST: return createExprList();
      case FortXTransPackage.PAR_BLOCK_ELEMS: return createParBlockElems();
      case FortXTransPackage.ELIFS: return createElifs();
      case FortXTransPackage.ELIF: return createElif();
      case FortXTransPackage.ELSE: return createElse();
      case FortXTransPackage.GENERATORS: return createGenerators();
      case FortXTransPackage.BINDING: return createBinding();
      case FortXTransPackage.GEN_CLAUSE: return createGenClause();
      case FortXTransPackage.BLOCK_ELEMS: return createBlockElems();
      case FortXTransPackage.BLOCK_ELEM: return createBlockElem();
      case FortXTransPackage.DO: return createDo();
      case FortXTransPackage.DO_FRONT: return createDoFront();
      case FortXTransPackage.ID_OR_TUPLE: return createIdOrTuple();
      case FortXTransPackage.IS_TYPE: return createIsType();
      case FortXTransPackage.FIELD_DECL: return createFieldDecl();
      case FortXTransPackage.NO_NEWLINE_VAR_WTYPES: return createNoNewlineVarWTypes();
      case FortXTransPackage.NO_NEWLINE_VAR_WTYPE: return createNoNewlineVarWType();
      case FortXTransPackage.INIT_VAL: return createInitVal();
      case FortXTransPackage.LITERAL_TUPLE: return createLiteralTuple();
      case FortXTransPackage.LITERAL: return createLiteral();
      case FortXTransPackage.LOCAL_VAR_DECL: return createLocalVarDecl();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component createComponent()
  {
    ComponentImpl component = new ComponentImpl();
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public API createAPI()
  {
    APIImpl api = new APIImpl();
    return api;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Export createExport()
  {
    ExportImpl export = new ExportImpl();
    return export;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportedNames createImportedNames()
  {
    ImportedNamesImpl importedNames = new ImportedNamesImpl();
    return importedNames;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleNames createSimpleNames()
  {
    SimpleNamesImpl simpleNames = new SimpleNamesImpl();
    return simpleNames;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleName createSimpleName()
  {
    SimpleNameImpl simpleName = new SimpleNameImpl();
    return simpleName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AliasedSimpleName createAliasedSimpleName()
  {
    AliasedSimpleNameImpl aliasedSimpleName = new AliasedSimpleNameImpl();
    return aliasedSimpleName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AliasedAPINames createAliasedAPINames()
  {
    AliasedAPINamesImpl aliasedAPINames = new AliasedAPINamesImpl();
    return aliasedAPINames;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AliasedAPIName createAliasedAPIName()
  {
    AliasedAPINameImpl aliasedAPIName = new AliasedAPINameImpl();
    return aliasedAPIName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Decls createDecls()
  {
    DeclsImpl decls = new DeclsImpl();
    return decls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Decl createDecl()
  {
    DeclImpl decl = new DeclImpl();
    return decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FnMods createFnMods()
  {
    FnModsImpl fnMods = new FnModsImpl();
    return fnMods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FnMod createFnMod()
  {
    FnModImpl fnMod = new FnModImpl();
    return fnMod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValParam createValParam()
  {
    ValParamImpl valParam = new ValParamImpl();
    return valParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Param createParam()
  {
    ParamImpl param = new ParamImpl();
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RetType createRetType()
  {
    RetTypeImpl retType = new RetTypeImpl();
    return retType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TupleType createTupleType()
  {
    TupleTypeImpl tupleType = new TupleTypeImpl();
    return tupleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FnDecl createFnDecl()
  {
    FnDeclImpl fnDecl = new FnDeclImpl();
    return fnDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stmnt createStmnt()
  {
    StmntImpl stmnt = new StmntImpl();
    return stmnt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr createExpr()
  {
    ExprImpl expr = new ExprImpl();
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprFront createExprFront()
  {
    ExprFrontImpl exprFront = new ExprFrontImpl();
    return exprFront;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprTail createExprTail()
  {
    ExprTailImpl exprTail = new ExprTailImpl();
    return exprTail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DelimitedExpr createDelimitedExpr()
  {
    DelimitedExprImpl delimitedExpr = new DelimitedExprImpl();
    return delimitedExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprList createExprList()
  {
    ExprListImpl exprList = new ExprListImpl();
    return exprList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParBlockElems createParBlockElems()
  {
    ParBlockElemsImpl parBlockElems = new ParBlockElemsImpl();
    return parBlockElems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Elifs createElifs()
  {
    ElifsImpl elifs = new ElifsImpl();
    return elifs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Elif createElif()
  {
    ElifImpl elif = new ElifImpl();
    return elif;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Else createElse()
  {
    ElseImpl else_ = new ElseImpl();
    return else_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Generators createGenerators()
  {
    GeneratorsImpl generators = new GeneratorsImpl();
    return generators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding createBinding()
  {
    BindingImpl binding = new BindingImpl();
    return binding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenClause createGenClause()
  {
    GenClauseImpl genClause = new GenClauseImpl();
    return genClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockElems createBlockElems()
  {
    BlockElemsImpl blockElems = new BlockElemsImpl();
    return blockElems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockElem createBlockElem()
  {
    BlockElemImpl blockElem = new BlockElemImpl();
    return blockElem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Do createDo()
  {
    DoImpl do_ = new DoImpl();
    return do_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoFront createDoFront()
  {
    DoFrontImpl doFront = new DoFrontImpl();
    return doFront;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdOrTuple createIdOrTuple()
  {
    IdOrTupleImpl idOrTuple = new IdOrTupleImpl();
    return idOrTuple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IsType createIsType()
  {
    IsTypeImpl isType = new IsTypeImpl();
    return isType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldDecl createFieldDecl()
  {
    FieldDeclImpl fieldDecl = new FieldDeclImpl();
    return fieldDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoNewlineVarWTypes createNoNewlineVarWTypes()
  {
    NoNewlineVarWTypesImpl noNewlineVarWTypes = new NoNewlineVarWTypesImpl();
    return noNewlineVarWTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoNewlineVarWType createNoNewlineVarWType()
  {
    NoNewlineVarWTypeImpl noNewlineVarWType = new NoNewlineVarWTypeImpl();
    return noNewlineVarWType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitVal createInitVal()
  {
    InitValImpl initVal = new InitValImpl();
    return initVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralTuple createLiteralTuple()
  {
    LiteralTupleImpl literalTuple = new LiteralTupleImpl();
    return literalTuple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalVarDecl createLocalVarDecl()
  {
    LocalVarDeclImpl localVarDecl = new LocalVarDeclImpl();
    return localVarDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FortXTransPackage getFortXTransPackage()
  {
    return (FortXTransPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FortXTransPackage getPackage()
  {
    return FortXTransPackage.eINSTANCE;
  }

} //FortXTransFactoryImpl
