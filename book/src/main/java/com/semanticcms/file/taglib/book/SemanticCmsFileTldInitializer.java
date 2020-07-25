/*
 * semanticcms-file-taglib - Files nested within SemanticCMS pages and elements in a JSP environment.
 * Copyright (C) 2016, 2017, 2019, 2020  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of semanticcms-file-taglib.
 *
 * semanticcms-file-taglib is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * semanticcms-file-taglib is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with semanticcms-file-taglib.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.semanticcms.file.taglib.book;

import com.aoindustries.net.DomainName;
import com.aoindustries.net.Path;
import com.aoindustries.validation.ValidationException;
import com.semanticcms.core.model.BookRef;
import com.semanticcms.core.model.ResourceRef;
import com.semanticcms.tagreference.TagReferenceInitializer;

public class SemanticCmsFileTldInitializer extends TagReferenceInitializer {

	public SemanticCmsFileTldInitializer() throws ValidationException {
		super(
			Maven.properties.getProperty("documented.name") + " Reference",
			"Taglib Reference",
			new ResourceRef(
				new BookRef(
					DomainName.valueOf("semanticcms.com"),
					Path.valueOf("/file/taglib")
				),
				Path.valueOf("/semanticcms-file.tld")
			),
			true,
			Maven.properties.getProperty("documented.javadoc.link.javase"),
			Maven.properties.getProperty("documented.javadoc.link.javaee"),
			// Self
			"com.semanticcms.file.taglib", Maven.properties.getProperty("project.url") + "apidocs/",
			// Dependencies
			"com.semanticcms.core.model", "https://semanticcms.com/core/model/apidocs/"
		);
	}
}
