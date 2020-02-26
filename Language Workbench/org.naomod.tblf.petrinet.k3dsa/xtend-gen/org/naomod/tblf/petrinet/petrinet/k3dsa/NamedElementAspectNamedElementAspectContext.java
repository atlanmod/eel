package org.naomod.tblf.petrinet.petrinet.k3dsa;

import java.util.Map;
import org.naomod.tblf.petrinet.NamedElement;
import org.naomod.tblf.petrinet.petrinet.k3dsa.NamedElementAspectNamedElementAspectProperties;

@SuppressWarnings("all")
public class NamedElementAspectNamedElementAspectContext {
  public final static NamedElementAspectNamedElementAspectContext INSTANCE = new NamedElementAspectNamedElementAspectContext();
  
  public static NamedElementAspectNamedElementAspectProperties getSelf(final NamedElement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.naomod.tblf.petrinet.petrinet.k3dsa.NamedElementAspectNamedElementAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NamedElement, NamedElementAspectNamedElementAspectProperties> map = new java.util.WeakHashMap<org.naomod.tblf.petrinet.NamedElement, org.naomod.tblf.petrinet.petrinet.k3dsa.NamedElementAspectNamedElementAspectProperties>();
  
  public Map<NamedElement, NamedElementAspectNamedElementAspectProperties> getMap() {
    return map;
  }
}
