package org.naomod.tblf.petrinet.petrinet.k3dsa;

import java.util.Map;
import org.naomod.tblf.petrinet.Net;
import org.naomod.tblf.petrinet.petrinet.k3dsa.NetAspectNetAspectProperties;

@SuppressWarnings("all")
public class NetAspectNetAspectContext {
  public final static NetAspectNetAspectContext INSTANCE = new NetAspectNetAspectContext();
  
  public static NetAspectNetAspectProperties getSelf(final Net _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.naomod.tblf.petrinet.petrinet.k3dsa.NetAspectNetAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Net, NetAspectNetAspectProperties> map = new java.util.WeakHashMap<org.naomod.tblf.petrinet.Net, org.naomod.tblf.petrinet.petrinet.k3dsa.NetAspectNetAspectProperties>();
  
  public Map<Net, NetAspectNetAspectProperties> getMap() {
    return map;
  }
}
