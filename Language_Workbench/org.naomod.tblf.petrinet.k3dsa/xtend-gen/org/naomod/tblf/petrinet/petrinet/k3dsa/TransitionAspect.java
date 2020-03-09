package org.naomod.tblf.petrinet.petrinet.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.naomod.tblf.petrinet.Place;
import org.naomod.tblf.petrinet.Transition;
import org.naomod.tblf.petrinet.petrinet.k3dsa.NamedElementAspect;
import org.naomod.tblf.petrinet.petrinet.k3dsa.TransitionAspectTransitionAspectProperties;

@Aspect(className = Transition.class)
@SuppressWarnings("all")
public class TransitionAspect extends NamedElementAspect {
  public static Boolean canFire(final Transition _self) {
    final org.naomod.tblf.petrinet.petrinet.k3dsa.TransitionAspectTransitionAspectProperties _self_ = org.naomod.tblf.petrinet.petrinet.k3dsa.TransitionAspectTransitionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Boolean canFire()
    if (_self instanceof org.naomod.tblf.petrinet.Transition){
    	result = org.naomod.tblf.petrinet.petrinet.k3dsa.TransitionAspect._privk3_canFire(_self_, (org.naomod.tblf.petrinet.Transition)_self);
    };
    return (java.lang.Boolean)result;
  }
  
  @Step
  public static void fire(final Transition _self) {
    final org.naomod.tblf.petrinet.petrinet.k3dsa.TransitionAspectTransitionAspectProperties _self_ = org.naomod.tblf.petrinet.petrinet.k3dsa.TransitionAspectTransitionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void fire()
    if (_self instanceof org.naomod.tblf.petrinet.Transition){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.naomod.tblf.petrinet.petrinet.k3dsa.TransitionAspect._privk3_fire(_self_, (org.naomod.tblf.petrinet.Transition)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Transition", "fire");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static Boolean _privk3_canFire(final TransitionAspectTransitionAspectProperties _self_, final Transition _self) {
    final Function1<Place, Boolean> _function = (Place p) -> {
      int _tokens = p.getTokens();
      return Boolean.valueOf((_tokens > 0));
    };
    return Boolean.valueOf(IterableExtensions.<Place>forall(_self.getInput(), _function));
  }
  
  protected static void _privk3_fire(final TransitionAspectTransitionAspectProperties _self_, final Transition _self) {
    try {
      String _name = _self.getName();
      String _plus = (_name + ": fire!");
      InputOutput.<String>println(_plus);
      final Consumer<Place> _function = (Place p) -> {
        final Function1<Place, Boolean> _function_1 = (Place it) -> {
          int _tokens = it.getTokens();
          return Boolean.valueOf((_tokens > 0));
        };
        Place input_p = IterableExtensions.<Place>findFirst(_self.getInput(), _function_1);
        int _tokens = input_p.getTokens();
        int _minus = (_tokens - 1);
        input_p.setTokens(_minus);
        String _name_1 = input_p.getName();
        String _plus_1 = ("Removing a token from " + _name_1);
        InputOutput.<String>println(_plus_1);
        int _tokens_1 = p.getTokens();
        int _plus_2 = (_tokens_1 + 1);
        p.setTokens(_plus_2);
        String _name_2 = p.getName();
        String _plus_3 = ("Adding token in " + _name_2);
        InputOutput.<String>println(_plus_3);
      };
      _self.getOutput().forEach(_function);
      Thread.sleep(1000);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
