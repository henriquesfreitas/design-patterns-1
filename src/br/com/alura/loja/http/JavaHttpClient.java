package br.com.alura.loja.http;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter {

	@Override
	public void post(String url, Map<String, Object> dados) {
		try {
			URL urlAPI = new URL(url);
//			URLConnection connecti
//			entre outros comandos para fazer a requisicao
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
			throw new RuntimeException("erro ao fazer requisicao");
		}

	}

}
