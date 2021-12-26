package br.com.sicredi.simulacao;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {

    public static String request (Object object) throws Exception {
        returpackage br.com.sicredi.simulacao;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {

    public static String request (Object object) throws Exception {
        return new ObjectMapper().writer().withDefaultPrettyPrinter().writeValueAsString(object);
    }
}
