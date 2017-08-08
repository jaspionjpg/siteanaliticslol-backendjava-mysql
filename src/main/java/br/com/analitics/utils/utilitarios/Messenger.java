/**
 * This document is a part of the source code and related artifacts
 * for Unilims, a restricted laboratorial system.
 *
 * http://www.unicorp.com.br
 *
 * Copyright © 2014 Unicorp Informática Industrial - All Rights Reserved
 *
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 *
 */

package br.com.analitics.utils.utilitarios;

import java.util.ResourceBundle;
import java.util.StringTokenizer;

/**
 * Util class for retrieving messages from a multi language resource bundle archive
 * 
 * @author DevTeam
 * 
 */
public final class Messenger {
	/**
	 * The resource bundle of messages
	 */
	private static ResourceBundle bundle = null;


	/** 
     * Obtém o arquivo de configurações no formato de leitura com a classe ResourceBundle 
     * @return ResourceBundle configurado com o properties "GlobalMessages_pt_BR.properties" 
     */  
    private static ResourceBundle getResource() {  
        if (bundle == null){  
            bundle = ResourceBundle.getBundle("messages/GlobalMessages");  
        }  
        return bundle;  
    } 
    
    /** 
     * Obtém o valor de chave no arquivo properties.  
     * Obs.: Neste arquivo a forma de representação dos dados é feita como "key=value". 
     * @param key - chave com o valor para ser pesquisado no properties 
     * @return value - string com o valor contido no arquivo 
     */  
    public static String getMessage(String key) {  
        try {  
            return getResource().getString(key);  
        } catch (Exception e) {  
            System.err.print(e.getMessage());  
        }  
        return null;  
    } 
    
    /** 
     * Obtém o valor de chave no arquivo properties. Com uma função definida, o retorno da valor é formatado com um StringTokenizer, 
     * separando este valor um um array de String's pelo token ",". 
     *  
     * Com este exemplo definido no properties de um value assim: 
     * Exemplo: key=value, value2, value3 
     * O retorno será de um array: 
     * {"value1", "value2", "value3"} 
     *  
     * Obs.: Neste arquivo a forma de representação dos dados é feita como "key=value". 
     * @param key - chave com o valor para ser pesquisado no properties 
     * @return values - array de string com os valores contidos no arquivo 
     */  
    public static String[] getMessageArray(String key) {  
        String[] retorno = null;  
        try {  
            String array = getResource().getString(key);  
            StringTokenizer st = new StringTokenizer(array, ",");  
            int tokens = st.countTokens();  
            retorno = new String[tokens];  
  
            for (int i = 0; i < tokens; i++) {  
                retorno[i] = st.nextToken();  
            }  
              
        } catch (Exception e) {  
            System.err.print(e.getMessage());              
        }  
        return retorno;  
    }
}