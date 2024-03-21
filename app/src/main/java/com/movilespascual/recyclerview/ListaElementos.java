package com.movilespascual.recyclerview;

public class ListaElementos {

    package com.movilespascual.recyclerview;

    public class ListaElementos {
        public String sender;
        public String subject;
        String date;
        private String message;

        public ListaElementos(String sender, String subject, String date, String message) {
            this.sender = sender;
            this.subject = subject;
            this.date = date;
            this.message = message;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

}
