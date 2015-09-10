/*! ******************************************************************************
 *
 * Pentaho Data Integration
 *
 * Copyright (C) 2002-2015 by Pentaho : http://www.pentaho.com
 *
 *******************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ******************************************************************************/

package org.pentaho.di.trans.dataservice.serialization;

import org.pentaho.di.core.exception.KettleException;
import org.pentaho.di.trans.dataservice.DataServiceMeta;

import java.text.MessageFormat;

/**
 * @author nhudak
 */
class UndefinedDataServiceException extends KettleException {
  private final DataServiceMeta dataServiceMeta;

  public UndefinedDataServiceException( DataServiceMeta dataServiceMeta ) {
    super( MessageFormat.format( "Data Service {0} is undefined.", dataServiceMeta.getName() ) );
    this.dataServiceMeta = dataServiceMeta;
  }

  public DataServiceMeta getDataServiceMeta() {
    return dataServiceMeta;
  }
}