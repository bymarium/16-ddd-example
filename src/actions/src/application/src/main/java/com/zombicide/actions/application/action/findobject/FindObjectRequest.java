package com.zombicide.actions.application.action.findobject;

import com.zombicide.shared.application.Request;

public class FindObjectRequest extends Request {
  private final String nameAction;
  private final String description;
  private final String effect;
  private final Integer positionX;
  private final Integer positionY;
  private final Boolean isNoisy;

  public FindObjectRequest(String nameAction, String description, String effect, Integer positionX, Integer positionY, Boolean isNoisy) {
    super(null);
    this.nameAction = nameAction;
    this.description = description;
    this.effect = effect;
    this.positionX = positionX;
    this.positionY = positionY;
    this.isNoisy = isNoisy;
  }

  public String getNameAction() {
    return nameAction;
  }

  public String getDescription() {
    return description;
  }

  public String getEffect() {
    return effect;
  }

  public Integer getPositionX() {
    return positionX;
  }

  public Integer getPositionY() {
    return positionY;
  }

  public Boolean getNoisy() {
    return isNoisy;
  }
}
