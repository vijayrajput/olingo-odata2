/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.olingo.odata2.core.servicedocument;

import java.util.List;

import org.apache.olingo.odata2.api.servicedocument.ExtensionAttribute;
import org.apache.olingo.odata2.api.servicedocument.ExtensionElement;

/**
 *  
 */
public class ExtensionElementImpl implements ExtensionElement {
  private String namespace;
  private String prefix;
  private String name;
  private String text;
  private List<ExtensionElement> anyElements;
  private List<ExtensionAttribute> attributes;

  @Override
  public String getNamespace() {
    return namespace;
  }

  @Override
  public String getPrefix() {
    return prefix;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getText() {
    return text;
  }

  @Override
  public List<ExtensionElement> getElements() {
    return anyElements;
  }

  @Override
  public List<ExtensionAttribute> getAttributes() {
    return attributes;
  }

  public ExtensionElementImpl setNamespace(final String namespace) {
    this.namespace = namespace;
    return this;
  }

  public ExtensionElementImpl setPrefix(final String prefix) {
    this.prefix = prefix;
    return this;
  }

  public ExtensionElementImpl setName(final String name) {
    this.name = name;
    return this;
  }

  public ExtensionElementImpl setText(final String text) {
    this.text = text;
    return this;

  }

  public ExtensionElementImpl setElements(final List<ExtensionElement> anyElements) {
    this.anyElements = anyElements;
    return this;
  }

  public ExtensionElementImpl setAttributes(final List<ExtensionAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }

}
