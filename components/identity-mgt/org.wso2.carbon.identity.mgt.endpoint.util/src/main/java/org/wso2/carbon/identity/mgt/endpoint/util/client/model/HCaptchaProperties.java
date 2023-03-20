/*
 *  Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */

package org.wso2.carbon.identity.mgt.endpoint.util.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * This class able to hold HCaptcha properties.
 */
public class HCaptchaProperties {

    private Boolean hCaptchaEnabled = null;
    private String hCaptchaKey = null;
    private String hCaptchaAPI = null;

    /**
     * Return object of this class after set the hCaptchaEnabled.
     *
     * @param hCaptchaEnabled Is captcha enabled.
     * @return hCaptchaProperties.
     */
    public HCaptchaProperties hCaptchaEnabled(boolean hCaptchaEnabled) {

        this.hCaptchaEnabled = hCaptchaEnabled;
        return this;
    }

    @JsonProperty("hCaptchaEnabled")
    public boolean getHCaptchaEnabled() {

        return hCaptchaEnabled;
    }

    public void setHCaptchaEnabled(boolean hCaptchaEnabled) {

        this.hCaptchaEnabled = hCaptchaEnabled;
    }

    /**
     * Return object of this class after set the hCaptchaKey.
     *
     * @param hCaptchaKey reCaptcha key.
     * @return hCaptchaProperties.
     */
    public HCaptchaProperties hCaptchaKey(String hCaptchaKey) {

        this.hCaptchaKey = hCaptchaKey;
        return this;
    }

    @JsonProperty("hCaptchaKey")
    public String getHCaptchaKey() {

        return hCaptchaKey;
    }

    public void setHCaptchaKey(String hCaptchaKey) {

        this.hCaptchaKey = hCaptchaKey;
    }

    /**
     * Return object of this class after set the hCaptchaAPI.
     *
     * @param hCaptchaAPI captcha API.
     * @return HCaptchaProperties.
     */
    public HCaptchaProperties hCaptchaAPI(String hCaptchaAPI) {

        this.hCaptchaAPI = hCaptchaAPI;
        return this;
    }

    @JsonProperty("hCaptchaAPI")
    public String getHCaptchaAPI() {

        return hCaptchaAPI;
    }

    public void setHCaptchaAPI(String hCaptchaAPI) {

        this.hCaptchaAPI = hCaptchaAPI;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HCaptchaProperties hCaptchaProperties = (HCaptchaProperties) o;
        return Objects.equals(this.hCaptchaEnabled, hCaptchaProperties.hCaptchaEnabled) &&
                Objects.equals(this.hCaptchaKey, hCaptchaProperties.hCaptchaKey) &&
                Objects.equals(this.hCaptchaAPI, hCaptchaProperties.hCaptchaAPI);
    }

    @Override
    public int hashCode() {

        return Objects.hash(hCaptchaEnabled, hCaptchaKey, hCaptchaKey);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class HCaptchaProperties {\n");
        sb.append("    hCaptchaEnabled: ").append(toIndentedString(hCaptchaEnabled)).append("\n");
        sb.append("    hCaptchaKey: ").append(toIndentedString(hCaptchaKey)).append("\n");
        sb.append("    hCaptchaAPI: ").append(toIndentedString(hCaptchaKey)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     *
     * @param o object to convert.
     * @return String value of converted object.
     */
    private String toIndentedString(Object o) {

        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
