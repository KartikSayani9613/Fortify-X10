/**
 * generated by Xtext 2.13.0-SNAPSHOT
 */
package srf.transpiler.fortxtrans.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import srf.transpiler.fortxtrans.fortXTrans.BlockElems;
import srf.transpiler.fortxtrans.fortXTrans.Component;
import srf.transpiler.fortxtrans.fortXTrans.Decl;
import srf.transpiler.fortxtrans.fortXTrans.Decls;
import srf.transpiler.fortxtrans.fortXTrans.DelimitedExpr;
import srf.transpiler.fortxtrans.fortXTrans.Do;
import srf.transpiler.fortxtrans.fortXTrans.DoFront;
import srf.transpiler.fortxtrans.fortXTrans.Export;
import srf.transpiler.fortxtrans.fortXTrans.Expr;
import srf.transpiler.fortxtrans.fortXTrans.ExprFront;
import srf.transpiler.fortxtrans.fortXTrans.ExprTail;
import srf.transpiler.fortxtrans.fortXTrans.Expression;
import srf.transpiler.fortxtrans.fortXTrans.FnDecl;
import srf.transpiler.fortxtrans.fortXTrans.FnMod;
import srf.transpiler.fortxtrans.fortXTrans.FnMods;
import srf.transpiler.fortxtrans.fortXTrans.Import;
import srf.transpiler.fortxtrans.fortXTrans.Param;
import srf.transpiler.fortxtrans.fortXTrans.RetType;
import srf.transpiler.fortxtrans.fortXTrans.Type;
import srf.transpiler.fortxtrans.fortXTrans.ValParam;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class FortXTransGenerator extends AbstractGenerator {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Component> _filter = Iterables.<Component>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Component.class);
    for (final Component c : _filter) {
      String _string = this._iQualifiedNameProvider.getFullyQualifiedName(c).toString("/");
      String _plus = (_string + ".x10");
      fsa.generateFile(_plus, 
        this.compile(c));
    }
  }
  
  public CharSequence compile(final Component c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import x10.io.console;");
    _builder.newLine();
    _builder.append("import x10.lang.Math;");
    _builder.newLine();
    _builder.append("import x10.array.Array_1;");
    _builder.newLine();
    _builder.append("import x10.array.Array_2;");
    _builder.newLine();
    _builder.append("import x10.array.Array_3;");
    _builder.newLine();
    _builder.append("/*needs to import");
    _builder.newLine();
    {
      EList<Import> _imports = c.getImports();
      for(final Import i : _imports) {
        CharSequence _compile = this.compile(i);
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("*/");
    _builder.newLine();
    _builder.append("/*exports");
    _builder.newLine();
    {
      EList<Export> _exports = c.getExports();
      for(final Export e : _exports) {
        CharSequence _compile_1 = this.compile(e);
        _builder.append(_compile_1);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("*/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = c.getName();
    _builder.append(_name);
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    {
      EList<Decls> _decls = c.getDecls();
      for(final Decls d : _decls) {
        _builder.append("\t");
        CharSequence _compile_2 = this.compile(d);
        _builder.append(_compile_2, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Import i) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _api = i.getApi();
      boolean _tripleEquals = (_api == null);
      if (_tripleEquals) {
        String _imps = i.getImps();
        _builder.append(_imps);
        _builder.append(" ");
        String _impname = i.getImportedNames().getImpname();
        _builder.append(_impname);
        {
          String _asname = i.getImportedNames().getAsname();
          boolean _tripleNotEquals = (_asname != null);
          if (_tripleNotEquals) {
            _builder.append("as ");
            String _asname_1 = i.getImportedNames().getAsname();
            _builder.append(_asname_1);
          } else {
            {
              int _length = ((Object[])Conversions.unwrapArray(i.getImportedNames().getSimpList(), Object.class)).length;
              boolean _notEquals = (_length != 0);
              if (_notEquals) {
                _builder.append(".{");
                {
                  int _length_1 = ((Object[])Conversions.unwrapArray(i.getImportedNames().getSimpList(), Object.class)).length;
                  ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length_1, true);
                  for(final Integer s : _doubleDotLessThan) {
                    {
                      if (((s).intValue() == 0)) {
                        String _orig = i.getImportedNames().getSimpList().get((s).intValue()).getOrig();
                        _builder.append(_orig);
                      } else {
                        _builder.append(", ");
                        String _orig_1 = i.getImportedNames().getSimpList().get((s).intValue()).getOrig();
                        _builder.append(_orig_1);
                      }
                    }
                    {
                      String _asName = i.getImportedNames().getSimpList().get((s).intValue()).getAsName();
                      boolean _tripleNotEquals_1 = (_asName != null);
                      if (_tripleNotEquals_1) {
                        _builder.append(" as ");
                        String _asName_1 = i.getImportedNames().getSimpList().get((s).intValue()).getAsName();
                        _builder.append(_asName_1);
                      }
                    }
                  }
                }
                {
                  boolean _isComma = i.getImportedNames().isComma();
                  if (_isComma) {
                    _builder.append(" , ... ");
                  }
                }
                _builder.append("}");
              } else {
                _builder.append(".{...}");
                {
                  boolean _isExcept = i.getImportedNames().isExcept();
                  if (_isExcept) {
                    _builder.append(" except ");
                    {
                      String _brack = i.getImportedNames().getSimp().getBrack();
                      boolean _tripleNotEquals_2 = (_brack != null);
                      if (_tripleNotEquals_2) {
                        _builder.append("{");
                        {
                          int _length_2 = ((Object[])Conversions.unwrapArray(i.getImportedNames().getSimp().getNameList(), Object.class)).length;
                          ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _length_2, true);
                          for(final Integer s_1 : _doubleDotLessThan_1) {
                            {
                              if (((s_1).intValue() == 0)) {
                                String _name = i.getImportedNames().getSimp().getNameList().get((s_1).intValue()).getName();
                                _builder.append(_name);
                              } else {
                                _builder.append(", ");
                                String _name_1 = i.getImportedNames().getSimp().getNameList().get((s_1).intValue()).getName();
                                _builder.append(_name_1);
                              }
                            }
                          }
                        }
                        _builder.append("}");
                      } else {
                        String _name_2 = i.getImportedNames().getSimp().getNameList().get(0).getName();
                        _builder.append(_name_2);
                      }
                    }
                  }
                }
              }
            }
          }
        }
      } else {
        _builder.newLineIfNotEmpty();
        String _imps_1 = i.getImps();
        _builder.append(_imps_1);
        _builder.append(" ");
        String _api_1 = i.getApi();
        _builder.append(_api_1);
        _builder.append(" ");
        {
          String _brack_1 = i.getAliasedimportedNames().getBrack();
          boolean _tripleNotEquals_3 = (_brack_1 != null);
          if (_tripleNotEquals_3) {
            _builder.append("{");
            {
              int _length_3 = ((Object[])Conversions.unwrapArray(i.getAliasedimportedNames().getNameList(), Object.class)).length;
              ExclusiveRange _doubleDotLessThan_2 = new ExclusiveRange(0, _length_3, true);
              for(final Integer s_2 : _doubleDotLessThan_2) {
                {
                  if (((s_2).intValue() == 0)) {
                    String _orig_2 = i.getAliasedimportedNames().getNameList().get(0).getOrig();
                    _builder.append(_orig_2);
                  } else {
                    _builder.append(", ");
                    String _orig_3 = i.getAliasedimportedNames().getNameList().get(0).getOrig();
                    _builder.append(_orig_3);
                  }
                }
                {
                  String _asName_2 = i.getAliasedimportedNames().getNameList().get((s_2).intValue()).getAsName();
                  boolean _tripleNotEquals_4 = (_asName_2 != null);
                  if (_tripleNotEquals_4) {
                    _builder.append(" as ");
                    String _asName_3 = i.getAliasedimportedNames().getNameList().get(0).getAsName();
                    _builder.append(_asName_3);
                  }
                }
              }
            }
            _builder.append("}");
          } else {
            String _orig_4 = i.getAliasedimportedNames().getNameList().get(0).getOrig();
            _builder.append(_orig_4);
            {
              String _asName_4 = i.getAliasedimportedNames().getNameList().get(0).getAsName();
              boolean _tripleNotEquals_5 = (_asName_4 != null);
              if (_tripleNotEquals_5) {
                _builder.append(" as ");
                String _asName_5 = i.getAliasedimportedNames().getNameList().get(0).getAsName();
                _builder.append(_asName_5);
              }
            }
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final ValParam p) {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _length = ((Object[])Conversions.unwrapArray(p.getParams(), Object.class)).length;
      boolean _equals = (_length == 0);
      if (_equals) {
      } else {
        {
          String _brack = p.getBrack();
          boolean _tripleEquals = (_brack == null);
          if (_tripleEquals) {
            Param _get = p.getParams().get(0);
            _builder.append(_get);
          } else {
            {
              int _length_1 = ((Object[])Conversions.unwrapArray(p.getParams(), Object.class)).length;
              ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length_1, true);
              for(final Integer s : _doubleDotLessThan) {
                {
                  if (((s).intValue() == 0)) {
                    String _bId = p.getParams().get((s).intValue()).getBId();
                    _builder.append(_bId);
                    _builder.append(":");
                  } else {
                    _builder.append(", ");
                    String _bId_1 = p.getParams().get((s).intValue()).getBId();
                    _builder.append(_bId_1);
                    _builder.append(":");
                  }
                }
                {
                  String _tname = p.getParams().get((s).intValue()).getIstype().getType().getTname();
                  boolean _equals_1 = Objects.equal(_tname, "ZZ32");
                  if (_equals_1) {
                    _builder.append("Int");
                  } else {
                    {
                      String _tname_1 = p.getParams().get((s).intValue()).getIstype().getType().getTname();
                      boolean _equals_2 = Objects.equal(_tname_1, "ZZ64");
                      if (_equals_2) {
                        _builder.append("Long");
                      } else {
                        {
                          String _tname_2 = p.getParams().get((s).intValue()).getIstype().getType().getTname();
                          boolean _equals_3 = Objects.equal(_tname_2, "RR32");
                          if (_equals_3) {
                            _builder.append("Float");
                          } else {
                            {
                              String _tname_3 = p.getParams().get((s).intValue()).getIstype().getType().getTname();
                              boolean _equals_4 = Objects.equal(_tname_3, "RR64");
                              if (_equals_4) {
                                _builder.append("Double");
                              } else {
                                {
                                  String _tname_4 = p.getParams().get((s).intValue()).getIstype().getType().getTname();
                                  boolean _equals_5 = Objects.equal(_tname_4, "String");
                                  if (_equals_5) {
                                    _builder.append("String");
                                  } else {
                                    String _tname_5 = p.getParams().get((s).intValue()).getIstype().getType().getTname();
                                    _builder.append(_tname_5);
                                    String _tname_6 = p.getParams().get((s).intValue()).getIstype().getType().getTname();
                                    _builder.append(_tname_6);
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Export e) {
    StringConcatenation _builder = new StringConcatenation();
    String _exp = e.getExp();
    _builder.append(_exp);
    _builder.append(" ");
    {
      String _brack = e.getBrack();
      boolean _tripleNotEquals = (_brack != null);
      if (_tripleNotEquals) {
        _builder.append("{");
        {
          int _length = ((Object[])Conversions.unwrapArray(e.getExportedName(), Object.class)).length;
          ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
          for(final Integer s : _doubleDotLessThan) {
            {
              if (((s).intValue() == 0)) {
                String _get = e.getExportedName().get((s).intValue());
                _builder.append(_get);
              } else {
                _builder.append(", ");
                String _get_1 = e.getExportedName().get((s).intValue());
                _builder.append(_get_1);
              }
            }
          }
        }
        _builder.append("}");
      } else {
        String _get_2 = e.getExportedName().get(0);
        _builder.append(_get_2);
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Decls d) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Decl> _decls = d.getDecls();
      for(final Decl dec : _decls) {
        CharSequence _compile = this.compile(dec);
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Decl d) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _compile = this.compile(d.getFunction());
    _builder.append(_compile);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final FnDecl f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _name = f.getName();
      boolean _equals = Objects.equal(_name, "run");
      if (_equals) {
        _builder.append("public static def main(args:Rail[String])");
      } else {
        {
          FnMods _mods = f.getMods();
          boolean _tripleNotEquals = (_mods != null);
          if (_tripleNotEquals) {
            {
              EList<FnMod> _mods_1 = f.getMods().getMods();
              for(final FnMod mod : _mods_1) {
                String _modtype = mod.getModtype();
                _builder.append(_modtype);
              }
            }
          }
        }
        _builder.append(" static def ");
        String _name_1 = f.getName();
        _builder.append(_name_1);
        _builder.append("(");
        {
          ValParam _params = f.getParams();
          boolean _tripleNotEquals_1 = (_params != null);
          if (_tripleNotEquals_1) {
            CharSequence _compile = this.compile(f.getParams());
            _builder.append(_compile);
          }
        }
        _builder.append(")");
        {
          RetType _retVal = f.getRetVal();
          boolean _tripleNotEquals_2 = (_retVal != null);
          if (_tripleNotEquals_2) {
            _builder.append(":");
            {
              String _empty = f.getRetVal().getEmpty();
              boolean _equals_1 = Objects.equal(_empty, "(");
              if (_equals_1) {
                _builder.append("void");
              } else {
                {
                  String _tname = f.getRetVal().getType().getTname();
                  boolean _equals_2 = Objects.equal(_tname, "ZZ32");
                  if (_equals_2) {
                    _builder.append("Int");
                  } else {
                    {
                      String _tname_1 = f.getRetVal().getType().getTname();
                      boolean _equals_3 = Objects.equal(_tname_1, "ZZ64");
                      if (_equals_3) {
                        _builder.append("Long");
                      } else {
                        {
                          String _tname_2 = f.getRetVal().getType().getTname();
                          boolean _equals_4 = Objects.equal(_tname_2, "RR32");
                          if (_equals_4) {
                            _builder.append("Float");
                          } else {
                            {
                              String _tname_3 = f.getRetVal().getType().getTname();
                              boolean _equals_5 = Objects.equal(_tname_3, "RR64");
                              if (_equals_5) {
                                _builder.append("Double");
                              } else {
                                {
                                  String _tname_4 = f.getRetVal().getType().getTname();
                                  boolean _equals_6 = Objects.equal(_tname_4, "String");
                                  if (_equals_6) {
                                    _builder.append("String");
                                  } else {
                                    String _tname_5 = f.getRetVal().getType().getTname();
                                    _builder.append(_tname_5);
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    _builder.append("{\t");
    _builder.newLineIfNotEmpty();
    {
      boolean _isBody = f.isBody();
      if (_isBody) {
        _builder.append("\t");
        String _compile_1 = this.compile(f.getFnItself());
        _builder.append(_compile_1);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public String compile(final Expression e) {
    StringConcatenation _builder = new StringConcatenation();
    String _compile = this.compile(e.getExp());
    _builder.append(_compile);
    return _builder.toString();
  }
  
  public String compile(final Expr e) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _compile = this.compile(e.getFront());
    _builder.append(_compile);
    {
      EList<ExprTail> _tails = e.getTails();
      boolean _tripleNotEquals = (_tails != null);
      if (_tripleNotEquals) {
        {
          EList<ExprTail> _tails_1 = e.getTails();
          for(final ExprTail t : _tails_1) {
            CharSequence _compile_1 = this.compile(t);
            _builder.append(_compile_1);
          }
        }
      }
    }
    return _builder.toString();
  }
  
  public CharSequence compile(final ExprTail t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("as ");
    Type _type = t.getType();
    _builder.append(_type, " ");
    return _builder;
  }
  
  public CharSequence compile(final ExprFront ef) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _id = ef.getId();
      boolean _tripleNotEquals = (_id != null);
      if (_tripleNotEquals) {
        String _id_1 = ef.getId();
        _builder.append(_id_1);
      } else {
        {
          DelimitedExpr _delim = ef.getDelim();
          boolean _tripleNotEquals_1 = (_delim != null);
          if (_tripleNotEquals_1) {
            CharSequence _compile = this.compile(ef.getDelim());
            _builder.append(_compile);
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final DelimitedExpr d) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Do _dod = d.getDod();
      boolean _tripleNotEquals = (_dod != null);
      if (_tripleNotEquals) {
        CharSequence _compile = this.compile(d.getDod());
        _builder.append(_compile);
      } else {
        {
          String _awhile = d.getAwhile();
          boolean _tripleNotEquals_1 = (_awhile != null);
          if (_tripleNotEquals_1) {
            _builder.append("while(");
            String _compile_1 = this.compile(d.getExpr());
            _builder.append(_compile_1);
            _builder.append("){");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            CharSequence _compile_2 = this.compile(d.getWhiledod());
            _builder.append(_compile_2, "\t\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          } else {
            {
              String _afor = d.getAfor();
              boolean _tripleNotEquals_2 = (_afor != null);
              if (_tripleNotEquals_2) {
                _builder.append("for()");
                CharSequence _compile_3 = this.compile(d.getDofront());
                _builder.append(_compile_3);
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Do dobox) {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _length = ((Object[])Conversions.unwrapArray(dobox.getDofs(), Object.class)).length;
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
      for(final Integer d : _doubleDotLessThan) {
        {
          if (((d).intValue() != 0)) {
            _builder.append("async ");
          }
        }
        CharSequence _compile = this.compile(dobox.getDofs().get((d).intValue()));
        _builder.append(_compile);
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final DoFront dof) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isAt = dof.isAt();
      if (_isAt) {
        _builder.append("at(");
        String _compile = this.compile(dof.getExp());
        _builder.append(_compile);
        _builder.append(") ");
      }
    }
    {
      boolean _isAtom = dof.isAtom();
      if (_isAtom) {
        _builder.append("atomic{");
        _builder.newLineIfNotEmpty();
      }
    }
    CharSequence _compile_1 = this.compile(dof.getBlock());
    _builder.append(_compile_1);
    return _builder;
  }
  
  public CharSequence compile(final BlockElems bs) {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _length = ((Object[])Conversions.unwrapArray(bs.getBlock(), Object.class)).length;
      boolean _notEquals = (_length != 1);
      if (_notEquals) {
        _builder.append("{");
        _builder.newLineIfNotEmpty();
        {
          int _length_1 = ((Object[])Conversions.unwrapArray(bs.getBlock(), Object.class)).length;
          ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length_1, true);
          for(final Integer b : _doubleDotLessThan) {
            _builder.append("    ");
            String _compile = this.compile(bs.getBlock().get((b).intValue()).getExp());
            _builder.append(_compile, "    ");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("}");
      } else {
        String _compile_1 = this.compile(bs.getBlock().get(0).getExp());
        _builder.append(_compile_1);
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
