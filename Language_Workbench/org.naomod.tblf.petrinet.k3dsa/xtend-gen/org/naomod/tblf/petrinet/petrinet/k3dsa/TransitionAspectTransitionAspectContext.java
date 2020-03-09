package org.naomod.tblf.petrinet.petrinet.k3dsa;

import java.util.Map;
import org.naomod.tblf.petrinet.Transition;
import org.naomod.tblf.petrinet.petrinet.k3dsa.TransitionAspectTransitionAspectProperties;

@SuppressWarnings("all")
public class TransitionAspectTransitionAspectContext {
  public final static TransitionAspectTransitionAspectContext INSTANCE = new TransitionAspectTransitionAspectContext();
  
  public static TransitionAspectTransitionAspectProperties getSelf(final Transition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.naomod.tblf.petrinet.petrinet.k3dsa.TransitionAspectTransitionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Transition, TransitionAspectTransitionAspectProperties> map = new java.util.WeakHashMap<org.naomod.tblf.petrinet.Transition, org.naomod.tblf.petrinet.petrinet.k3dsa.TransitionAspectTransitionAspectProperties>();
  
  public Map<Transition, TransitionAspectTransitionAspectProperties> getMap() {
    return map;
  }
}
