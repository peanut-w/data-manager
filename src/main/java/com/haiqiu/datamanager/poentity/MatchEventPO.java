package com.haiqiu.datamanager.poentity;

import java.util.Date;

public class MatchEventPO {
    private Integer id;

    private Integer matchId;

    private Integer teamId;

    private Integer personId;

    private Integer teamPersonId;

    private Integer additionalPersonId;

    private String action;

    private String kind;

    private String content;

    private Integer minute;

    private Date created;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMatchId() {
        return matchId;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Integer getTeamPersonId() {
        return teamPersonId;
    }

    public void setTeamPersonId(Integer teamPersonId) {
        this.teamPersonId = teamPersonId;
    }

    public Integer getAdditionalPersonId() {
        return additionalPersonId;
    }

    public void setAdditionalPersonId(Integer additionalPersonId) {
        this.additionalPersonId = additionalPersonId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind == null ? null : kind.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getMinute() {
        return minute;
    }

    public void setMinute(Integer minute) {
        this.minute = minute;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
