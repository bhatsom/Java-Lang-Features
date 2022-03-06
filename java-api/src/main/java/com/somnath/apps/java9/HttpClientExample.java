package com.somnath.apps.java9;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class HttpClientExample {

	public static void main(String[] args) throws Exception {
		httpGetRequest();
		httpPostRequest();
		asynchronousRequest();
		asynchronousMultipleRequests();
	}

	public static void httpGetRequest() throws URISyntaxException, IOException, InterruptedException {
		System.out.println("================Executing httpGetRequest()================");
		HttpClient client = HttpClient.newHttpClient();
		URI httpURI = new URI("http://jsonplaceholder.typicode.com/posts/1");
		HttpRequest request = HttpRequest.newBuilder(httpURI).GET()
				.headers("Accept-Enconding", "gzip, deflate").build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		String responseBody = response.body();
		int responseStatusCode = response.statusCode();
		System.out.println("Status Code: " + responseStatusCode + " ResponseBody: " + responseBody);
	}

	public static void httpPostRequest() throws URISyntaxException, IOException, InterruptedException {
		System.out.println("================Executing httpPostRequest()================");
		HttpClient client = HttpClient
				.newBuilder()
				.build();
		HttpRequest request = HttpRequest
				.newBuilder(new URI("http://jsonplaceholder.typicode.com/posts"))
				.POST(BodyPublishers.ofString("Sample Post Request"))
				.build();
		HttpResponse<String> response
				= client.send(request, HttpResponse.BodyHandlers.ofString());
		String responseBody = response.body();
		int responseStatusCode = response.statusCode();
		System.out.println("Status Code: " + responseStatusCode + " ResponseBody: " + responseBody);
	}

	public static void asynchronousRequest() throws Exception {
		System.out.println("================Executing asynchronousRequest()================");
		HttpClient client = HttpClient.newHttpClient();
		URI httpURI = new URI("http://jsonplaceholder.typicode.com/posts/1");
		HttpRequest request = HttpRequest.newBuilder(httpURI).GET().build();
		CompletableFuture<HttpResponse<String>> futureResponse = client.sendAsync(request,
				HttpResponse.BodyHandlers.ofString());
		HttpResponse<String> response = futureResponse.get();
		System.out.println("Status Code: " + response.statusCode() + " ResponseBody: " + response.body());
	}

	public static void asynchronousMultipleRequests() throws URISyntaxException {
		System.out.println("================Executing asynchronousMultipleRequests()================");
		List<URI> targets = Arrays.asList(
				new URI("http://jsonplaceholder.typicode.com/posts/1"),
				new URI("http://jsonplaceholder.typicode.com/posts/2")
		);
		HttpClient client = HttpClient.newHttpClient();
		List<CompletableFuture<File>> futures = targets
				.stream()
				.map(target -> client
						.sendAsync(
								HttpRequest.newBuilder(target)
										.GET()
										.build(),
								BodyHandlers.ofFile(Paths.get("base", target.getPath())))
						.thenApply(response -> response.body())
						.thenApply(path -> path.toFile()))
				.collect(Collectors.toList());
	}

}