/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import org.yaml.snakeyaml.Yaml;

/**
 *
 * @author papejajr
 */
public class TesteYAML {

    public static void main(String[] args) {
        Yaml yaml = new Yaml();
        Object obj = yaml.load("a: 1\nb: 2\nc:\n  - aaa\n  - bbb");
        System.out.println(obj);
    }
}
