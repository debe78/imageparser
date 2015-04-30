/**
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package it.larusba.imageparser.service;

import it.larusba.imageparser.domain.ColourAnalysis;
import it.larusba.imageparser.exception.ImageParserException;

import java.util.List;

/**
 * @author Enrico De Benetti
 * @since 30 Apr 2015
 *
 */
public interface ImageManager {

	List<ColourAnalysis> analyseVanGoghImage() throws ImageParserException;
	
	ColourAnalysis analyzeImage() throws ImageParserException;
}
