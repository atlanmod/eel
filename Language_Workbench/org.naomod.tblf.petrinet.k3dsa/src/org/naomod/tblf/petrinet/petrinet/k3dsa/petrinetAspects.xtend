package org.naomod.tblf.petrinet.petrinet.k3dsa

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import static extension org.naomod.tblf.petrinet.petrinet.k3dsa.NetAspect.*
import static extension org.naomod.tblf.petrinet.petrinet.k3dsa.PlaceAspect.*
import static extension org.naomod.tblf.petrinet.petrinet.k3dsa.TransitionAspect.*
import static extension org.naomod.tblf.petrinet.petrinet.k3dsa.NamedElementAspect.*
import org.naomod.tblf.petrinet.Net
import org.naomod.tblf.petrinet.Place
import org.naomod.tblf.petrinet.Transition
import org.naomod.tblf.petrinet.NamedElement
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import org.eclipse.emf.common.util.EList

@Aspect(className=Net)
class NetAspect extends NamedElementAspect {
	
	@Step
	@InitializeModel
	def public void setup(EList<String> args) {
		
	} 
	
	@Main	
	@Step
	def public void start() {
		var executed = true		
								
		do {
			executed = false;
			for (t : _self.transitions) {
				if (t.canFire) {
					t.fire
					executed = true
				}			
			}
		} while (executed)
	} 	
}

@Aspect(className=Place)
class PlaceAspect extends NamedElementAspect {
	
}

@Aspect(className=Transition)
class TransitionAspect extends NamedElementAspect {
		
	def public Boolean canFire() {
		return _self.input.forall[p | p.tokens > 0];
	} 	
	
	@Step
	def public void fire() {
		println(_self.name+": fire!");		
		
		_self.output.forEach[p | {			
			var input_p = _self.input.findFirst[it | it.tokens > 0]
			input_p.tokens = input_p.tokens - 1
			println("Removing a token from "+input_p.name)
			p.tokens = p.tokens + 1
			println("Adding token in "+p.name);
		}];
		
		
		Thread.sleep(1000);
	}
}

@Aspect(className=NamedElement)
class NamedElementAspect {

}



 