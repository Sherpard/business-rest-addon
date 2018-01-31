/*
 * Copyright © 2013-2017, The SeedStack authors <http://seedstack.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package org.seedstack.business.modelmapper.internal;

import com.google.inject.AbstractModule;
import org.modelmapper.ModelMapper;
import org.seedstack.seed.Install;

@Install
public class ModelMapperModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(ModelMapper.class).toProvider(ModelMapperProvider.class);
    }
}