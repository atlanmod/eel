/**
 */
package fr.tblf.energy.estimation.eel.provider;


import fr.tblf.energy.estimation.eel.EelFactory;
import fr.tblf.energy.estimation.eel.EelPackage;
import fr.tblf.energy.estimation.eel.Interval;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.tblf.energy.estimation.eel.Interval} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IntervalItemProvider extends MeasurementUncertaintyInformationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntervalItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(EelPackage.Literals.INTERVAL__LOWER_ENDPOINT);
			childrenFeatures.add(EelPackage.Literals.INTERVAL__UPPER_ENDPOINT);
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
	 * This returns Interval.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Interval"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Interval_type");
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

		switch (notification.getFeatureID(Interval.class)) {
			case EelPackage.INTERVAL__LOWER_ENDPOINT:
			case EelPackage.INTERVAL__UPPER_ENDPOINT:
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
				(EelPackage.Literals.INTERVAL__LOWER_ENDPOINT,
				 EelFactory.eINSTANCE.createMeasureValue()));

		newChildDescriptors.add
			(createChildParameter
				(EelPackage.Literals.INTERVAL__LOWER_ENDPOINT,
				 EelFactory.eINSTANCE.createMeasureOCL()));

		newChildDescriptors.add
			(createChildParameter
				(EelPackage.Literals.INTERVAL__LOWER_ENDPOINT,
				 EelFactory.eINSTANCE.createMeasureAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(EelPackage.Literals.INTERVAL__LOWER_ENDPOINT,
				 EelFactory.eINSTANCE.createMeasureCast()));

		newChildDescriptors.add
			(createChildParameter
				(EelPackage.Literals.INTERVAL__LOWER_ENDPOINT,
				 EelFactory.eINSTANCE.createMeasureBinaryProductOperation()));

		newChildDescriptors.add
			(createChildParameter
				(EelPackage.Literals.INTERVAL__LOWER_ENDPOINT,
				 EelFactory.eINSTANCE.createMeasureBinarySumOperation()));

		newChildDescriptors.add
			(createChildParameter
				(EelPackage.Literals.INTERVAL__LOWER_ENDPOINT,
				 EelFactory.eINSTANCE.createEnergyComputation()));

		newChildDescriptors.add
			(createChildParameter
				(EelPackage.Literals.INTERVAL__LOWER_ENDPOINT,
				 EelFactory.eINSTANCE.createPowerComputation()));

		newChildDescriptors.add
			(createChildParameter
				(EelPackage.Literals.INTERVAL__LOWER_ENDPOINT,
				 EelFactory.eINSTANCE.createRealTimeDuration()));

		newChildDescriptors.add
			(createChildParameter
				(EelPackage.Literals.INTERVAL__LOWER_ENDPOINT,
				 EelFactory.eINSTANCE.createMeasureUnboundSumOperation()));

		newChildDescriptors.add
			(createChildParameter
				(EelPackage.Literals.INTERVAL__LOWER_ENDPOINT,
				 EelFactory.eINSTANCE.createMeasureUnboundProductOperation()));

		newChildDescriptors.add
			(createChildParameter
				(EelPackage.Literals.INTERVAL__UPPER_ENDPOINT,
				 EelFactory.eINSTANCE.createMeasureValue()));

		newChildDescriptors.add
			(createChildParameter
				(EelPackage.Literals.INTERVAL__UPPER_ENDPOINT,
				 EelFactory.eINSTANCE.createMeasureOCL()));

		newChildDescriptors.add
			(createChildParameter
				(EelPackage.Literals.INTERVAL__UPPER_ENDPOINT,
				 EelFactory.eINSTANCE.createMeasureAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(EelPackage.Literals.INTERVAL__UPPER_ENDPOINT,
				 EelFactory.eINSTANCE.createMeasureCast()));

		newChildDescriptors.add
			(createChildParameter
				(EelPackage.Literals.INTERVAL__UPPER_ENDPOINT,
				 EelFactory.eINSTANCE.createMeasureBinaryProductOperation()));

		newChildDescriptors.add
			(createChildParameter
				(EelPackage.Literals.INTERVAL__UPPER_ENDPOINT,
				 EelFactory.eINSTANCE.createMeasureBinarySumOperation()));

		newChildDescriptors.add
			(createChildParameter
				(EelPackage.Literals.INTERVAL__UPPER_ENDPOINT,
				 EelFactory.eINSTANCE.createEnergyComputation()));

		newChildDescriptors.add
			(createChildParameter
				(EelPackage.Literals.INTERVAL__UPPER_ENDPOINT,
				 EelFactory.eINSTANCE.createPowerComputation()));

		newChildDescriptors.add
			(createChildParameter
				(EelPackage.Literals.INTERVAL__UPPER_ENDPOINT,
				 EelFactory.eINSTANCE.createRealTimeDuration()));

		newChildDescriptors.add
			(createChildParameter
				(EelPackage.Literals.INTERVAL__UPPER_ENDPOINT,
				 EelFactory.eINSTANCE.createMeasureUnboundSumOperation()));

		newChildDescriptors.add
			(createChildParameter
				(EelPackage.Literals.INTERVAL__UPPER_ENDPOINT,
				 EelFactory.eINSTANCE.createMeasureUnboundProductOperation()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == EelPackage.Literals.INTERVAL__LOWER_ENDPOINT ||
			childFeature == EelPackage.Literals.INTERVAL__UPPER_ENDPOINT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
