/*
 * Copyright (c) 2019 Villu Ruusmann
 *
 * This file is part of JPMML-SkLearn
 *
 * JPMML-SkLearn is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JPMML-SkLearn is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with JPMML-SkLearn.  If not, see <http://www.gnu.org/licenses/>.
 */
package pandas.core;

import org.jpmml.sklearn.CClassDict;

public class BlockManager extends CClassDict {

	public BlockManager(String module, String name){
		super(module, name);
	}

	@Override
	public void __setstate__(Object[] args){

		if(args.length > 3){
			Object[] newArgs = new Object[3];

			System.arraycopy(args, 0, newArgs, 0, newArgs.length);

			args = newArgs;
		}

		super.__setstate__(createAttributeMap(SETSTATE_ATTRIBUTES, args));
	}

	private static final String[] SETSTATE_ATTRIBUTES = {
		"axes_array",
		"block_values",
		"block_items"
	};
}