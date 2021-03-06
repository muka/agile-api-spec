/*******************************************************************************
 * Copyright (C) 2017 Create-Net / FBK.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Create-Net / FBK - initial API and implementation
 ******************************************************************************/
package iot.agile.object;

import org.freedesktop.dbus.Position;
import org.freedesktop.dbus.Struct;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"parameters"})
public  final class DiscoveryStatus extends Struct {
  @Position(0)
  public final String name;
  @Position(1)
  public final String status;

  public DiscoveryStatus(String name, String status) {
    this.name = name;
    this.status = status;
  }

  public String getName() {
    return name;
  }

  public String getStatus() {
    return status;
  }

}
