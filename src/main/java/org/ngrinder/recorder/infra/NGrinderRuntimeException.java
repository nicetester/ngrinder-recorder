/* 
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */
package org.ngrinder.recorder.infra;

/**
 * NGrinderRuntimeException. This is for translating a general exception to {@link RuntimeException}
 * .
 * 
 * @author JunHo Yoon
 * @since 1.0
 */
public class NGrinderRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 8662535812004958944L;

	/**
	 * Constructor.
	 * 
	 * @param message
	 *            message
	 */
	public NGrinderRuntimeException(String message) {
		super(message);
	}

	/**
	 * Constructor.
	 * 
	 * @param message
	 *            message
	 * @param t
	 *            root cause
	 */
	public NGrinderRuntimeException(String message, Throwable t) {
		super(message, t);
	}
}
