package com.company.network;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RapidAPI {
    private String WebsiteMalware;
    private String WOTWebRisk;
    private String ScamAdviser;
    private String MalwareScanner;

    public RapidAPI(String websiteMalware, String WOTWebRisk, String scamAdviser, String malwareScanner, HttpRequest websiteMalwarerequest, HttpResponse<String> websiteMalwareresponse, HttpRequest WOTWebRiskrequest, HttpResponse<String> WOTWebRiskresponse, HttpRequest scamAdviserrequest, HttpResponse<String> scamAdviserresponse, HttpRequest malwareScannerrequest, HttpResponse<String> malwareScannerresponse) throws IOException, InterruptedException {
        WebsiteMalware = websiteMalware;
        this.WOTWebRisk = WOTWebRisk;
        ScamAdviser = scamAdviser;
        MalwareScanner = malwareScanner;
        WebsiteMalwarerequest = websiteMalwarerequest;
        WebsiteMalwareresponse = websiteMalwareresponse;
        this.WOTWebRiskrequest = WOTWebRiskrequest;
        this.WOTWebRiskresponse = WOTWebRiskresponse;
        ScamAdviserrequest = scamAdviserrequest;
        ScamAdviserresponse = scamAdviserresponse;
        MalwareScannerrequest = malwareScannerrequest;
        MalwareScannerresponse = malwareScannerresponse;
    }

    HttpRequest WebsiteMalwarerequest = HttpRequest.newBuilder()
            .uri(URI.create("https://wot-web-risk-and-safe-browsing.p.rapidapi.com/targets?t=google.com"))
            .header("X-RapidAPI-Key", "0b15874b2cmsh738abf8fd7657e3p10b6a3jsn4361f540473d")
            .header("X-RapidAPI-Host", "wot-web-risk-and-safe-browsing.p.rapidapi.com")
            .method("GET", HttpRequest.BodyPublishers.noBody())
            .build();
    HttpResponse<String> WebsiteMalwareresponse = HttpClient.newHttpClient().send(WebsiteMalwarerequest, HttpResponse.BodyHandlers.ofString());


    HttpRequest WOTWebRiskrequest = HttpRequest.newBuilder()
            .uri(URI.create("https://scamadviser-lite.p.rapidapi.com/v1/trust/single?domain=scamadviser.com&refresh=false"))
            .header("X-RapidAPI-Key", "0b15874b2cmsh738abf8fd7657e3p10b6a3jsn4361f540473d")
            .header("X-RapidAPI-Host", "scamadviser-lite.p.rapidapi.com")
            .method("GET", HttpRequest.BodyPublishers.noBody())
            .build();
    HttpResponse<String> WOTWebRiskresponse = HttpClient.newHttpClient().send(WOTWebRiskrequest, HttpResponse.BodyHandlers.ofString());


    HttpRequest ScamAdviserrequest = HttpRequest.newBuilder()
            .uri(URI.create("https://website-malware-and-security-checker1.p.rapidapi.com/check_cecurity?site=https%3A%2F%2Frapidapi.com%2F"))
            .header("X-RapidAPI-Key", "0b15874b2cmsh738abf8fd7657e3p10b6a3jsn4361f540473d")
            .header("X-RapidAPI-Host", "website-malware-and-security-checker1.p.rapidapi.com")
            .method("GET", HttpRequest.BodyPublishers.noBody())
            .build();
    HttpResponse<String> ScamAdviserresponse = HttpClient.newHttpClient().send(ScamAdviserrequest, HttpResponse.BodyHandlers.ofString());

    HttpRequest MalwareScannerrequest = HttpRequest.newBuilder()
            .uri(URI.create("https://malware-scanner1.p.rapidapi.com/scan?file=path%2Fto%2Ffile"))
            .header("X-RapidAPI-Key", "0b15874b2cmsh738abf8fd7657e3p10b6a3jsn4361f540473d")
            .header("X-RapidAPI-Host", "malware-scanner1.p.rapidapi.com")
            .method("GET", HttpRequest.BodyPublishers.noBody())
            .build();
    HttpResponse<String> MalwareScannerresponse = HttpClient.newHttpClient().send(MalwareScannerrequest, HttpResponse.BodyHandlers.ofString());


    public RapidAPI() throws IOException, InterruptedException {
    }

    public String getWebsiteMalware() {
        return WebsiteMalware;
    }

    public void setWebsiteMalware(String websiteMalware) {
        WebsiteMalware = websiteMalware;
    }

    public String getWOTWebRisk() {
        return WOTWebRisk;
    }

    public void setWOTWebRisk(String WOTWebRisk) {
        this.WOTWebRisk = WOTWebRisk;
    }

    public String getScamAdviser() {
        return ScamAdviser;
    }

    public void setScamAdviser(String scamAdviser) {
        ScamAdviser = scamAdviser;
    }

    public String getMalwareScanner() {
        return MalwareScanner;
    }

    public void setMalwareScanner(String malwareScanner) {
        MalwareScanner = malwareScanner;
    }

    public HttpRequest getWebsiteMalwarerequest() {
        return WebsiteMalwarerequest;
    }

    public void setWebsiteMalwarerequest(HttpRequest websiteMalwarerequest) {
        WebsiteMalwarerequest = websiteMalwarerequest;
    }

    public HttpResponse<String> getWebsiteMalwareresponse() {
        return WebsiteMalwareresponse;
    }

    public void setWebsiteMalwareresponse(HttpResponse<String> websiteMalwareresponse) {
        WebsiteMalwareresponse = websiteMalwareresponse;
    }

    public HttpRequest getWOTWebRiskrequest() {
        return WOTWebRiskrequest;
    }

    public void setWOTWebRiskrequest(HttpRequest WOTWebRiskrequest) {
        this.WOTWebRiskrequest = WOTWebRiskrequest;
    }

    public HttpResponse<String> getWOTWebRiskresponse() {
        return WOTWebRiskresponse;
    }

    public void setWOTWebRiskresponse(HttpResponse<String> WOTWebRiskresponse) {
        this.WOTWebRiskresponse = WOTWebRiskresponse;
    }

    public HttpRequest getScamAdviserrequest() {
        return ScamAdviserrequest;
    }

    public void setScamAdviserrequest(HttpRequest scamAdviserrequest) {
        ScamAdviserrequest = scamAdviserrequest;
    }

    public HttpResponse<String> getScamAdviserresponse() {
        return ScamAdviserresponse;
    }

    public void setScamAdviserresponse(HttpResponse<String> scamAdviserresponse) {
        ScamAdviserresponse = scamAdviserresponse;
    }

    public HttpRequest getMalwareScannerrequest() {
        return MalwareScannerrequest;
    }

    public void setMalwareScannerrequest(HttpRequest malwareScannerrequest) {
        MalwareScannerrequest = malwareScannerrequest;
    }

    public HttpResponse<String> getMalwareScannerresponse() {
        return MalwareScannerresponse;
    }

    public void setMalwareScannerresponse(HttpResponse<String> malwareScannerresponse) {
        MalwareScannerresponse = malwareScannerresponse;
    }
}
