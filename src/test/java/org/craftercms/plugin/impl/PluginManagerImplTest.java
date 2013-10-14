/*
 * Copyright (C) 2007-2013 Crafter Software Corporation.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.craftercms.plugin.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.craftercms.context.ContextTest;
import org.craftercms.plugin.Context;
import org.craftercms.plugin.PluginManager;
import org.craftercms.plugin.impl.PluginManagerImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.fail;

/**
 * @author David Escalante López
 */
public class PluginManagerImplTest {

    // <editor-fold defaultstate="collapsed" desc="Constants">

    private static String TEST_PROPERTIES_PATH = "test-plugin-manager.properties";
    private static String TEST_PLUGINS_PATH = "/Users/davidescalante/dev/Practica/test-jars";
    private static String TEST_CONTEXT_TYPE = "test";

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Attributes">

    PluginManager pluginManager = null;

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Set Up">

    @Before
    public void setUp() {
        pluginManager = new PluginManagerImpl(TEST_PROPERTIES_PATH);
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Tests">

    @Test
    public void testInit() throws Exception {
        List<String> pluginFolders = new ArrayList<>();
        Map<String, Context> contextMap = new HashMap<>();
        contextMap.put(TEST_CONTEXT_TYPE, new ContextTest());
        pluginFolders.add(TEST_PLUGINS_PATH);
        pluginManager.init(pluginFolders, contextMap);

    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Tear Down">

    @After
    public void tearDown() {

    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Internal Functionality">

    // </editor-fold>
}
