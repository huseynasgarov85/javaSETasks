package interfaceTasks.inter;

public enum SuccessfullyResponse implements ThisGenerated {
    SUCCESS("success", "Successfully"),;
    String key;
    String message;

    SuccessfullyResponse(String success, String successfully) {
        this.key = success;
        this.message = successfully;
    }
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String key() {
        return key;
    }

    @Override
    public String message() {
        return message;
    }
}
