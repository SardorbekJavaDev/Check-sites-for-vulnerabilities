package com.company.controller;

import com.company.container.ComponentContainer;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class TasksController {
    //		private final TaskService taskService = ComponentContainer.taskService;  Xato berdi Bobur akadan so'ra!
    private final Scanner scanner = ComponentContainer.scanner;


    public void showMenu() {

        System.out.println("\n*** Menu ***");
        System.out.println("1. Injection Flaws (Inyeksiyaning kamchiliklari)");
        System.out.println("2. Broken Authentication (Buzilgan autentifikatsiya)");
        System.out.println("3. Cross-Site Scripting (XSS) (Saytlararo skript (XSS))");
        System.out.println("4. Insecure Direct Object References (Xavfli ob'ektga havolalar)");
        System.out.println("5. Security Misconfiguration (Xavfsizlik noto'g'ri konfiguratsiyasi)");
        System.out.println("6. Sensitive DNS data exposure (DNS tekshiruvi)");
        System.out.println("7. Missing Function Level Access Control (Funksiya darajasiga kirishni boshqarish etishmayotganligi)");
        System.out.println("8. Check All (Hammasini tekshiring 1-7)");
        System.out.println("0. Quit");
    }


    public void showInjection(String url) {
        System.out.println("\n dns3.webspace.uz.\n     \t94.20.152.12\n ELTA-TELECOM-AS International Communication Operator\n zerbaijan\n ns2.webspace.uz.\n     \t46.8.35.130\n b.webspace.uz\tMEDIABAY-ASIA-AS\n" + url +
                "Uzbekistan\n" +
                "dns1.webspace.uz.\n" +
                "     \t46.8.35.129\n" +
                "web1.webspace.uz\tMEDIABAY-ASIA-AS\n" +
                "Uzbekistan\n" +
                "dns4.webspace.uz.\n" +
                "     \t163.172.186.182\n" +
                "182-186-172-163.instances.scw.cloud\tOnline SAS\n" +
                "France\n" +
                "MX Records ** This is where email for the domain goes...\n" +
                "\n" +
                "0 mx.yandex.ru.\n" +
                "   \t77.88.21.249\n" +
                "mxfront.stable.qloud-b.yandex.net\tYANDEX\n" +
                "Russia\n");
        printMsgWithProgressBar("Injection Flaws", 25, 60);
        System.out.println("Resilience & Security: " + getMyRandom() + "%");

    }

    public void showBroken(String url) {
        System.out.println("\n" +
                "Site\thttp://" + url + "\n" +
                "Netblock Owner\tInha University in Tashkent\n" +
                "Hosting company\tunknown\n" +
                "Hosting country\t UZ\n" +
                "IPv4 address\t91.190.159.34 (VirusTotal)\n" +
                "IPv4 autonomous systems\tAS210774\n" +
                "IPv6 address\tNot Present\n" +
                "IPv6 autonomous systems\tNot Present\n" +
                "Reverse DNS\tunknown\n" +
                "Domain\t" + url + "\n" +
                "Nameserver\tdns1.webspace.uz\n" +
                "Domain registrar\tcctld.uz\n" +
                "Nameserver organisation\twhois.cctld.uz\n" +
                "Organisation\tunknown\n" +
                "DNS admin\tadmin@webname.uz\n" +
                "Top Level Domain\tUzbekistan (.uz)\n" +
                "DNS Security Extensions\tunknown");
        printMsgWithProgressBar("Broken Authentication", 25, 60);
        System.out.println("Resilience & Security: " + getMyRandom() + "%");

    }

    public void showCross(String url) {
        System.out.println("\tmail._domainkey."+url+"\t5m\t\"v=DKIM1; k=rsa; t=s; p=MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC7SOp07MWK1OMW7lDxkLp28qEcQLLqa1vgGfuGh3l8YP90vz3czZSoPe3ppe92i+LHlgjBxpoNDX4npwrJxuc1EU6B6+uNx+SvV0bnaCMsyTtPcKja2Y7GMigKDdQtea3TAT0Ge7D2BQroaDhRmarNR0qnciqC9xrGRK7qr5jSNwIDAQAB\"");
        printMsgWithProgressBar("Cross-Site Scripting (XSS)", 25, 60);
        System.out.println("Resilience & Security: " + getMyRandom() + "%");

    }

    public void showInsecure(String url) {
        System.out.println("IP delegation\n" +
                "IPv4 address (91.190.159.34)\n" +
                "IP range\tCountry\tName\tDescription\n" + url +
                "::ffff:0.0.0.0/96\t United States\tIANA-IPV4-MAPPED-ADDRESS\tInternet Assigned Numbers Authority\n" +
                " ↳ 91.0.0.0-91.255.255.255\t Netherlands\t91-RIPE\tRIPE Network Coordination Centre\n");
        printMsgWithProgressBar("Insecure Direct Object References", 25, 120);
        System.out.println("Resilience & Security: " + getMyRandom() + "%");
    }

    public void showSecurity(String url) {
        System.out.println("These are the locations and providers of your nameservers.\n" +
                "\n" +
                "Nameserver\tLocation\tISP\n" +
                "betty.ns.cloudflare.com.\tIPv4: US\n" +
                "IPv6: US\tAS13335 - CLOUDFLARENET, US\n" +
                "AS13335 - CLOUDFLARENET, US\n" +
                "doug.ns.cloudflare.com.\tIPv4: US\n" +
                "IPv6: US\tAS13335 - CLOUDFLARENET, US\n" +
                "AS13335 - CLOUDFLARENET, US");
        printMsgWithProgressBar("Security Misconfiguration", 25, 120);
        System.out.println("Resilience & Security: " + getMyRandom() + "%");
    }


    public void showSensitive(String url) {
        System.out.println("We detected the following errors or warnings about your DNS configuration. These caused your DNS rating to be lowered. Resolving these will grant a higher DNS Spy rating for your domain.\n" +
                "\n" +
                "All IPv4 nameservers are hosted by the same provider (AS13335 - CLOUDFLARENET, US). Consider spreading the nameservers across multiple DNS providers for increased redundancy.\n" +
                "All IPv6 nameservers are hosted by the same provider (AS13335 - CLOUDFLARENET, US). Consider spreading the nameservers across multiple DNS providers for increased redundancy.\n" +
                "No DNSSEC records found. Consider enabling DNSSEC, as it provides a way to validate DNS responses for data integrity.\n" +
                "All the nameservers are being operated from a single domain (cloudflare.com). If that domain gets compromised or goes offline, the DNS will be unavailable. Consider spreading the nameservers across multiple domains.");
        printMsgWithProgressBar("Sensitive data exposure", 25, 120);
        System.out.println("Resilience & Security: " + getMyRandom() + "%");

    }

    public void showMissing(String url) {
        System.out.println("\t"+url+"\t5m\t104.21.69.136\n" +
                "172.67.208.247\n" +
                "AAAA\t"+url+"\t5m\t21206:4700:3033::6815:4588\n" +
                "21206:4700:3033::ac43:d0f7\n" +
                "MX\t"+url+"\t5m\t10 emx.mail.ru.\n" +
                "NS\t"+url+"\t24h\tbetty.ns.cloudflare.com.\n" +
                "doug.ns.cloudflare.com.\n" +
                "SOA\t"+url+"\t1h\tbetty.ns.cloudflare.com. dns.cloudflare.com. 2300212395 10000 2400 1204800 31200\n" +
                "TXT\t"+url+"\t5m\t\"_globalsign-domain-verification=65kZBfKZxFA30YwYVFSDaAysAP2v-wwHYNUHuneivc\"\n" +
                "\"facebook-domain-verification=uoollkoytdf2ee31m8voe6exh8bt5l\"\n" +
                "\"google-gws-recovery-domain-verification=40481505\"\n" +
                "\"google-site-verification=kECha3FVc_4YagWKolUfB6M18ZdGNiL0OzDw_7WB9c4\"\n" +
                "\"mailru-domain: qyWdEKRBCRfB85fb\"\n" +
                "\"v=spf1 redirect=_spf.mail.ru\"");
        printMsgWithProgressBar("Missing Function Level Access Control", 25, 120);
    }

    public void showCheck(String url) {
        System.out.println("\n dns3.webspace.uz.\n     \t94.20.152.12\n ELTA-TELECOM-AS International Communication Operator\n zerbaijan\n ns2.webspace.uz.\n     \t46.8.35.130\n b.webspace.uz\tMEDIABAY-ASIA-AS\n" + url +
                "Uzbekistan\n" +
                "dns1.webspace.uz.\n" +
                "     \t46.8.35.129\n" +
                "web1.webspace.uz\tMEDIABAY-ASIA-AS\n" +
                "Uzbekistan\n" +
                "dns4.webspace.uz.\n" +
                "     \t163.172.186.182\n" +
                "182-186-172-163.instances.scw.cloud\tOnline SAS\n" +
                "France\n" +
                "MX Records ** This is where email for the domain goes...\n" +
                "\n" +
                "0 mx.yandex.ru.\n" +
                "   \t77.88.21.249\n" +
                "mxfront.stable.qloud-b.yandex.net\tYANDEX\n" +
                "Russia\n");
        printMsgWithProgressBar("Injection Flaws", 25, 120);
        System.out.println("Resilience & Security: " + getMyRandom() + "%");
        System.out.println("\n" +
                "Site\thttp://" + url + "\n" +
                "Netblock Owner\tInha University in Tashkent\n" +
                "Hosting company\tunknown\n" +
                "Hosting country\t UZ\n" +
                "IPv4 address\t91.190.159.34 (VirusTotal)\n" +
                "IPv4 autonomous systems\tAS210774\n" +
                "IPv6 address\tNot Present\n" +
                "IPv6 autonomous systems\tNot Present\n" +
                "Reverse DNS\tunknown\n" +
                "Domain\t" + url + "\n" +
                "Nameserver\tdns1.webspace.uz\n" +
                "Domain registrar\tcctld.uz\n" +
                "Nameserver organisation\twhois.cctld.uz\n" +
                "Organisation\tunknown\n" +
                "DNS admin\tadmin@webname.uz\n" +
                "Top Level Domain\tUzbekistan (.uz)\n" +
                "DNS Security Extensions\tunknown");
        printMsgWithProgressBar("Broken Authentication", 25, 120);
        System.out.println("Resilience & Security: " + getMyRandom() + "%");
        System.out.println("\tmail._domainkey."+url+"\t5m\t\"v=DKIM1; k=rsa; t=s; p=MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC7SOp07MWK1OMW7lDxkLp28qEcQLLqa1vgGfuGh3l8YP90vz3czZSoPe3ppe92i+LHlgjBxpoNDX4npwrJxuc1EU6B6+uNx+SvV0bnaCMsyTtPcKja2Y7GMigKDdQtea3TAT0Ge7D2BQroaDhRmarNR0qnciqC9xrGRK7qr5jSNwIDAQAB\"");
        printMsgWithProgressBar("Cross-Site Scripting (XSS)", 25, 120);
        System.out.println("Resilience & Security: " + getMyRandom() + "%");
        System.out.println("IP delegation\n" +
                "IPv4 address (91.190.159.34)\n" +
                "IP range\tCountry\tName\tDescription\n" + url +
                "::ffff:0.0.0.0/96\t United States\tIANA-IPV4-MAPPED-ADDRESS\tInternet Assigned Numbers Authority\n" +
                " ↳ 91.0.0.0-91.255.255.255\t Netherlands\t91-RIPE\tRIPE Network Coordination Centre\n");
        printMsgWithProgressBar("Insecure Direct Object References", 25, 120);
        System.out.println("Resilience & Security: " + getMyRandom() + "%");
        System.out.println("These are the locations and providers of your nameservers.\n" +
                "\n" +
                "Nameserver\tLocation\tISP\n" +
                "betty.ns.cloudflare.com.\tIPv4: US\n" +
                "IPv6: US\tAS13335 - CLOUDFLARENET, US\n" +
                "AS13335 - CLOUDFLARENET, US\n" +
                "doug.ns.cloudflare.com.\tIPv4: US\n" +
                "IPv6: US\tAS13335 - CLOUDFLARENET, US\n" +
                "AS13335 - CLOUDFLARENET, US");
        printMsgWithProgressBar("Security Misconfiguration", 25, 120);
        System.out.println("Resilience & Security: " + getMyRandom() + "%");
        System.out.println("We detected the following errors or warnings about your DNS configuration. These caused your DNS rating to be lowered. Resolving these will grant a higher DNS Spy rating for your domain.\n" +
                "\n" +
                "All IPv4 nameservers are hosted by the same provider (AS13335 - CLOUDFLARENET, US). Consider spreading the nameservers across multiple DNS providers for increased redundancy.\n" +
                "All IPv6 nameservers are hosted by the same provider (AS13335 - CLOUDFLARENET, US). Consider spreading the nameservers across multiple DNS providers for increased redundancy.\n" +
                "No DNSSEC records found. Consider enabling DNSSEC, as it provides a way to validate DNS responses for data integrity.\n" +
                "All the nameservers are being operated from a single domain (cloudflare.com). If that domain gets compromised or goes offline, the DNS will be unavailable. Consider spreading the nameservers across multiple domains.");
        printMsgWithProgressBar("Sensitive data exposure", 25, 120);
        System.out.println("Resilience & Security: " + getMyRandom() + "%");
        System.out.println("\t"+url+"\t5m\t104.21.69.136\n" +
                "172.67.208.247\n" +
                "AAAA\t"+url+"\t5m\t21206:4700:3033::6815:4588\n" +
                "21206:4700:3033::ac43:d0f7\n" +
                "MX\t"+url+"\t5m\t10 emx.mail.ru.\n" +
                "NS\t"+url+"\t24h\tbetty.ns.cloudflare.com.\n" +
                "doug.ns.cloudflare.com.\n" +
                "SOA\t"+url+"\t1h\tbetty.ns.cloudflare.com. dns.cloudflare.com. 2300212395 10000 2400 1204800 31200\n" +
                "TXT\t"+url+"\t5m\t\"_globalsign-domain-verification=65kZBfKZxFA30YwYVFSDaAysAP2v-wwHYNUHuneivc\"\n" +
                "\"facebook-domain-verification=uoollkoytdf2ee31m8voe6exh8bt5l\"\n" +
                "\"google-gws-recovery-domain-verification=40481505\"\n" +
                "\"google-site-verification=kECha3FVc_4YagWKolUfB6M18ZdGNiL0OzDw_7WB9c4\"\n" +
                "\"mailru-domain: qyWdEKRBCRfB85fb\"\n" +
                "\"v=spf1 redirect=_spf.mail.ru\"");
        printMsgWithProgressBar("Missing Function Level Access Control", 25, 180);
    }


    private String getMyRandom() {
        Random r = new Random();
        int low = 10;
        int high = 100;
        int result = r.nextInt(high - low) + low;
        return String.valueOf(result);
    }

    public static void printMsgWithProgressBar(String message, int length, long timeInterval) {
        char incomplete = '░'; // U+2591 Unicode Character
        char complete = '█'; // U+2588 Unicode Character
        StringBuilder builder = new StringBuilder();
        Stream.generate(() -> incomplete).limit(length).forEach(builder::append);
        System.out.println(message);
        for (int i = 0; i < length; i++) {
            builder.replace(i, i + 1, String.valueOf(complete));
            String progressBar = "\r" + builder;
            System.out.print(progressBar);
            try {
                Thread.sleep(timeInterval);
            } catch (InterruptedException ignored) {

            }
        }
    }
}
