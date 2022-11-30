// Android Java:

 

// In your Application, replace the stock `evergage.start` code with:

try {
    JSONObject clientConfig = new JSONObject();
    clientConfig.put("dataset", "<the IS/Personalization tenant identifier>");
    clientConfig.put("account", "<the dataset to use for that tenant>");
    clientConfig.put("usePushNotifications", false);
 
    // Can still allow in dev/debug builds if desired:
     if (BuildConfig.DEBUG) {
	clientConfig.put("trackForeground", false);
	clientConfig.put("trackBackground", false);
        clientConfig.put("trackLaunch", false);
        clientConfig.put("trackInstallUpgrade", false);
    }
 
    Method method = evergage.getClass().getDeclaredMethod("startWithConfiguration", JSONObject.class);
    method.setAccessible(true);
    method.invoke(evergage, clientConfig);
} catch (Exception e) {
    //e.printStackTrace(); or whatever you prefer
}
