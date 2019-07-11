package fr.tblf.energy.estimation.eel.formatting2;

import eel.MetaClass;
import eel.Platform;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.IFormattableDocument;

@SuppressWarnings("all")
public class EelFormatter /* implements AbstractFormatter2  */{
  /* @Inject
   */private /* EelGrammarAccess */Object _eelGrammarAccess;
  
  protected void _format(final Platform platform, final /* IFormattableDocument */Object document) {
    throw new Error("Unresolved compilation problems:"
      + "\nInvalid number of arguments. The method format(EObject, IFormattableDocument) is not applicable for the arguments (Estimation)"
      + "\nInvalid number of arguments. The method format(EObject, IFormattableDocument) is not applicable for the arguments (Variable)"
      + "\nInvalid number of arguments. The method format(EObject, IFormattableDocument) is not applicable for the arguments (MetaClass)"
      + "\nThe method format(EObject, IFormattableDocument) from the type EelFormatter refers to the missing type IFormattableDocument"
      + "\nThe method format(EObject, IFormattableDocument) from the type EelFormatter refers to the missing type IFormattableDocument"
      + "\nThe method format(EObject, IFormattableDocument) from the type EelFormatter refers to the missing type IFormattableDocument");
  }
  
  protected void _format(final MetaClass metaClass, final /* IFormattableDocument */Object document) {
    throw new Error("Unresolved compilation problems:"
      + "\nInvalid number of arguments. The method format(EObject, IFormattableDocument) is not applicable for the arguments (Operation)"
      + "\nThe method format(EObject, IFormattableDocument) from the type EelFormatter refers to the missing type IFormattableDocument");
  }
  
  public void format(final EObject metaClass, final IFormattableDocument document) {
    if (metaClass instanceof MetaClass
         && document != null) {
      _format((MetaClass)metaClass, document);
      return;
    } else if (metaClass instanceof Platform
         && document != null) {
      _format((Platform)metaClass, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(metaClass, document).toString());
    }
  }
}
