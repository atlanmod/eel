/**
 */
package fr.tblf.energy.estimation.eel.provider;


import fr.tblf.energy.estimation.eel.EelFactory;
import fr.tblf.energy.estimation.eel.EelPackage;
import fr.tblf.energy.estimation.eel.MeasureCast;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.tblf.energy.estimation.eel.MeasureCast} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MeasureCastItemProvider extends TypedMeasureItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureCastItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EelPackage.Literals.MEASURE_CAST__MEASURE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns MeasureCast.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MeasureCast"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MeasureCast)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MeasureCast_type") :
			getString("_UI_MeasureCast_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(MeasureCast.class)) {
			case EelPackage.MEASURE_CAST__MEASURE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(EelPackage.Literals.MEASURE_CAST__MEASURE,
				 EelFactory.eINSTANCE.createMeasureValue()));

		newChildDescriptors.add
			(createChildParameter
				(EelPackage.Literals.MEASURE_CAST__MEASURE,
				 EelFactory.eINSTANCE.createMeasureOCL()));

		newChildDescriptors.add
			(createChildParameter
				(EelPackage.Literals.MEASURE_CAST__MEASURE,
				 EelFactory.eINSTANCE.createMeasureAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(EelPackage.Literals.MEASURE_CAST__MEASURE,
				 EelFactory.eINSTANCE.createMeasureCast()));

		newChildDescriptors.add
			(createChildParameter
				(EelPackage.Literals.MEASURE_CAST__MEASURE,
				 EelFactory.eINSTANCE.createMeasureProductOperation()));

		newChildDescriptors.add
			(createChildParameter
				(EelPackage.Literals.MEASURE_CAST__MEASURE,
				 EelFactory.eINSTANCE.createMeasureSumOperation()));

		newChildDescriptors.add
			(createChildParameter
				(EelPackage.Literals.MEASURE_CAST__MEASURE,
				 EelFactory.eINSTANCE.createEnergyComputation()));

		newChildDescriptors.add
			(createChildParameter
				(EelPackage.Literals.MEASURE_CAST__MEASURE,
				 EelFactory.eINSTANCE.createPowerComputation()));
	}

}
