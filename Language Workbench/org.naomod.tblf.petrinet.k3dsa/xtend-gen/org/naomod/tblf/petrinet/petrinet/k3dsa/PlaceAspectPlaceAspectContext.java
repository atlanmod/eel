package org.naomod.tblf.petrinet.petrinet.k3dsa;

import java.util.Map;
import org.naomod.tblf.petrinet.Place;
import org.naomod.tblf.petrinet.petrinet.k3dsa.PlaceAspectPlaceAspectProperties;

@SuppressWarnings("all")
public class PlaceAspectPlaceAspectContext {
  public final static PlaceAspectPlaceAspectContext INSTANCE = new PlaceAspectPlaceAspectContext();
  
  public static PlaceAspectPlaceAspectProperties getSelf(final Place _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.naomod.tblf.petrinet.petrinet.k3dsa.PlaceAspectPlaceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Place, PlaceAspectPlaceAspectProperties> map = new java.util.WeakHashMap<org.naomod.tblf.petrinet.Place, org.naomod.tblf.petrinet.petrinet.k3dsa.PlaceAspectPlaceAspectProperties>();
  
  public Map<Place, PlaceAspectPlaceAspectProperties> getMap() {
    return map;
  }
}
