package org.atlanmod.energy.estimation.smm;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.omg.smm.SmmModel;

public class SmmModelerToMM extends SmmModeler<Double, EClass> {


	public SmmModelerToMM(SmmModel model) {
		super(model);
	}

	@Override
	public EClass callerToTarget(EObject caller) {
		return caller.eClass();		
	}


}
