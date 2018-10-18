/*
 * This file is generated by jOOQ.
 */
package am.willi.persistence.domain.mysql.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * MySQL Foreign Servers table
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Servers implements Serializable {

    private static final long serialVersionUID = 242601436;

    private final String  serverName;
    private final String  host;
    private final String  db;
    private final String  username;
    private final String  password;
    private final Integer port;
    private final String  socket;
    private final String  wrapper;
    private final String  owner;

    public Servers(Servers value) {
        this.serverName = value.serverName;
        this.host = value.host;
        this.db = value.db;
        this.username = value.username;
        this.password = value.password;
        this.port = value.port;
        this.socket = value.socket;
        this.wrapper = value.wrapper;
        this.owner = value.owner;
    }

    public Servers(
        String  serverName,
        String  host,
        String  db,
        String  username,
        String  password,
        Integer port,
        String  socket,
        String  wrapper,
        String  owner
    ) {
        this.serverName = serverName;
        this.host = host;
        this.db = db;
        this.username = username;
        this.password = password;
        this.port = port;
        this.socket = socket;
        this.wrapper = wrapper;
        this.owner = owner;
    }

    public String getServerName() {
        return this.serverName;
    }

    public String getHost() {
        return this.host;
    }

    public String getDb() {
        return this.db;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public Integer getPort() {
        return this.port;
    }

    public String getSocket() {
        return this.socket;
    }

    public String getWrapper() {
        return this.wrapper;
    }

    public String getOwner() {
        return this.owner;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Servers (");

        sb.append(serverName);
        sb.append(", ").append(host);
        sb.append(", ").append(db);
        sb.append(", ").append(username);
        sb.append(", ").append(password);
        sb.append(", ").append(port);
        sb.append(", ").append(socket);
        sb.append(", ").append(wrapper);
        sb.append(", ").append(owner);

        sb.append(")");
        return sb.toString();
    }
}
