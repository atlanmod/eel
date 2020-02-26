package org.naomod.tblf.petrinet.petrinet.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.naomod.tblf.petrinet.Net;
import org.naomod.tblf.petrinet.Transition;
import org.naomod.tblf.petrinet.petrinet.k3dsa.NamedElementAspect;
import org.naomod.tblf.petrinet.petrinet.k3dsa.NetAspectNetAspectProperties;
import org.naomod.tblf.petrinet.petrinet.k3dsa.TransitionAspect;

@Aspect(className = Net.class)
@SuppressWarnings("all")
public class NetAspect extends NamedElementAspect {
  @Step
  @InitializeModel
  public static void setup(final Net _self, final EList<String> args) {
    final org.naomod.tblf.petrinet.petrinet.k3dsa.NetAspectNetAspectProperties _self_ = org.naomod.tblf.petrinet.petrinet.k3dsa.NetAspectNetAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void setup(EList<String>)
    if (_self instanceof org.naomod.tblf.petrinet.Net){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.naomod.tblf.petrinet.petrinet.k3dsa.NetAspect._privk3_setup(_self_, (org.naomod.tblf.petrinet.Net)_self,args);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {args}, command, "Net", "setup");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  @Main
  @Step
  public static void start(final Net _self) {
    final org.naomod.tblf.petrinet.petrinet.k3dsa.NetAspectNetAspectProperties _self_ = org.naomod.tblf.petrinet.petrinet.k3dsa.NetAspectNetAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void start()
    if (_self instanceof org.naomod.tblf.petrinet.Net){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.naomod.tblf.petrinet.petrinet.k3dsa.NetAspect._privk3_start(_self_, (org.naomod.tblf.petrinet.Net)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Net", "start");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_setup(final NetAspectNetAspectProperties _self_, final Net _self, final EList<String> args) {
  }
  
  protected static void _privk3_start(final NetAspectNetAspectProperties _self_, final Net _self) {
    boolean executed = true;
    do {
      {
        executed = false;
        EList<Transition> _transitions = _self.getTransitions();
        for (final Transition t : _transitions) {
          Boolean _canFire = TransitionAspect.canFire(t);
          if ((_canFire).booleanValue()) {
            TransitionAspect.fire(t);
            executed = true;
          }
        }
      }
    } while(executed);
  }
}
