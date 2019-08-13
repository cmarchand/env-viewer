/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */
package top.marchand.java.env.viewer;

/**
 * This class print to standard output
 * all java System properties, and all
 * environmenet entries.
 * 
 * Java System properties are prefixed by {@code ssp.}
 * Environmenet entries are prefixed by {@code env.}
 * 
 * Hence, it's easy to filter / sort output
 * @author cmarchand
 */
public class EnvViewer {
    
    public static void main(String[] args) {
        System.getProperties().keySet().forEach((key) -> {
            System.out.println("ssp."+key.toString()+"="+System.getProperty(key.toString()));
        });
        System.getenv().keySet().forEach((key) -> {
            System.out.println("env."+key+"="+System.getenv(key));
        });
    }
    
}
