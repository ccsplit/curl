package org.toilelibre.libe.curl;

import com.google.common.base.Joiner;

import static org.toilelibre.libe.curl.Curl.curl;

public class CurlCommandLine {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please specify the curl command you'd like to run.\nExample: java -jar curl.jar https://localhost:8443/public/");
            System.exit(1);
        }
        System.out.println(curl(Joiner.on(" ").join(args)));
    }
}
