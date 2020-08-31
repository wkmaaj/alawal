/*
 * Copyright 2020 PDB Corp.
 *
 * Proprietary Software built off of open-source software?
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.pdbcorp.easp.alawal.domain.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * 
 * @author jaradat-pdb
 */
@AllArgsConstructor
@Document
@EqualsAndHashCode(callSuper = false)
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
@Setter
public class Address {

	@NonNull
	private String addrLine1;

	private String addrLine2;

	private String addrLine3;

	@NonNull
	private String city;

	private String state;

	private String province;

	@NonNull
	private String country;

	private String postalCode;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [");
		if (addrLine1 != null)
			builder.append("addrLine1=").append(addrLine1);
		if (addrLine2 != null)
			builder.append(", addrLine2=").append(addrLine2);
		if (addrLine3 != null)
			builder.append(", addrLine3=").append(addrLine3);
		if (city != null)
			builder.append(", city=").append(city);
		if (state != null)
			builder.append(", state=").append(state);
		if (province != null)
			builder.append(", province=").append(province);
		if (country != null)
			builder.append(", country=").append(country);
		if (postalCode != null)
			builder.append(", postalCode=").append(postalCode);
		builder.append("]");
		return builder.toString();
	}

}