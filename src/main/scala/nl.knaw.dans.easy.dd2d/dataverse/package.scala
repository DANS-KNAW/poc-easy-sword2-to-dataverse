/**
 * Copyright (C) 2020 DANS - Data Archiving and Networked Services (info@dans.knaw.nl)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nl.knaw.dans.easy.dd2d

package object dataverse {
  case class CommandFailedException(status: Int, msg: String, body: String) extends Exception(s"Command could not be executed. Server returned: status line: '$msg', body: '$body'")

  object DepositState extends Enumeration {
    type DepositState = Value
    val SUBMITTED, PUBLISHED, REJECTED, FAILED = Value
  }
}
