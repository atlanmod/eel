package org.atlanmod.energy.estimation.smm;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.omg.smm.SmmModel;

public class SmmModelerToModel extends SmmModeler<Double, EObject> {


	public SmmModelerToModel(SmmModel model) {
		super(model);
	}

	@Override
	public EObject callerToTarget(EObject caller) {
		return caller;
	}

}
