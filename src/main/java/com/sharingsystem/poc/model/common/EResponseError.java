package com.sharingsystem.poc.model.common;

import lombok.Getter;

@Getter
public enum EResponseError {

        ACCESS_DENIED(000, "ACCESS_DENIED"),

        COMMON_SMS_SERVICE_FAILED(100, "Failed to send SMS"),
        COMMON_SMS_CLIENT_FAILED(101, "Failed to send SMS"),
        COMMON_SMS_FAILED(102, "Failed to send SMS"),
        COMMON_EMAIL_FAILED(103, "Failed to send email"),

        CACHE_FAILED(200, "Request Failed"),

        JWT_FAILED(300, "JWT failed"), JWT_EXPIRED(301, "JWT expired"),
        JWT_INVALID_OR_MISSING(302, "JWT invalid or missing"),
        JWT_INVALID_OR_MISSING_REFRESH_TOKEN(303, "JWT invalid or missing refresh token"),
        ANTIBOT_TOKEN_INVALID_OR_MISSING(304, "Antibot token invalid or missing refresh"),
        JWT_INVALID_OR_MISSING_USER_ID(305, "JWT invalid or missing user id"),
        JWT_INVALID_OR_MISSING_TYPE(306, "JWT invalid or missing type"),
        JWT_INVALID_OR_MISSING_AUTHORITIES(307, "JWT invalid or authorities"),

        NAME_IS_INVALID_OR_MISSING(000, "Name invalid or missing"),
        ROLE_IS_INVALID_OR_MISSING(000, "Role invalid or missing"),

        USER_FAILED_REQUEST(400, "Failed Request"),
        USER_INVALID_OR_MISSING_LOGIN_TYPE(401, "Invalid or missing login type"),
        USER_INVALID_OR_MISSING_EMAIL(402, "Invalid or missing email"),
        USER_INVALID_OR_MISSING_MOBILE_COUNTRY_CODE(403, "Invalid or missing mobile country code"),
        USER_INVALID_OR_MISSING_MOBILE(404, "Invalid or missing mobile"),
        USER_OTP_REACHED_LIMIT_TIMEOUT(405, "OTP reached limit timeout"), USER_OTP_TIMEOUT(406, "OTP timeout"),
        USER_OTP_MISSING(407, "OTP missing"), USER_OTP_EXPIRED(408, "OTP expired"),
        USER_OTP_INCORRECT(409, "OTP incorrect"), USER_FAILED_TO_CREATE(410, "Failed to create user"),
        USER_EMAIL_IS_ALREADY_IN_USE(411, "Email is already in use"),
        USER_MOBILE_IS_ALREADY_IN_USE(412, "Mobile is already in use"),

        USER_ID_INVALID_OR_MISSING(411, "User id is invalid or missing"),
        USER_OKID_INVALID_OR_MISSING(412, "User OKID is invalid or missing"),
        ORGANISATION_ID_INVALID_OR_MISSING(413, "Organisation id is invalid or missing"),
        ORGANISATION_OKID_INVALID_OR_MISSING(414, "Organisation OKID is invalid or missing"),

        USER_FAILED_TO_GET_OKID(412, "Failed to get user OKID"),
        USER_FAILED_TO_GENERATE_OKID(415, "Failed to generate user OKID"),
        ORGANISATION_FAILED_TO_GET_OKID(414, "Failed to get organisation OKID"),
        ORGANISATION_FAILED_TO_GENERATE_OKID(415, "Failed to generate organisation OKID"),
        FAILED_TO_GET_REFID(416, "Failed to get REFID"), FAILED_TO_GENERATE_REFID(417, "Failed to generate REFID"),
        ITEM_FAILED_TO_GET_OKID(418, "Failed to get itam OKID"),
        ITEM_FAILED_TO_GENERATE_OKID(419, "Failed to generate item OKID"),
        ITEM_CREATION_OVER_LIMIT_1000(419, "Item creation over limit of 1000"),

        ORGANISATION_FAILED_REQUEST(000, "Failed Request"),
        ORGANISATION_USER_EXIST(421, "User is already part of organisation"),
        ORGANISATION_USER_DOES_NOT_EXIST(421, "User is not part of organisation"),
        ORGANISATION_USER_OWNER_CANNOT_LEAVE(422, "Organisanation owner cannot leave"),
        ORGANISATION_USER_OWNER_CANNOT_BE_REMOVED(423, "Organisanation owner cannot be removed"),

        ORGANISATION_USER_INVITE_EXIST(422, "User hase been invited to organisation"),
        ORGANISATION_USER_INVITE_DOES_NOT_EXIST(423, "User has not been invited to organisation"),
        ORGANISATION_USER_INVITE_BLOCKED(424, "User has blocked invitation from organisation"),
        ORGANISATION_USER_INVITE_BLOCKED_DOES_NOT_EXIST(425, "User has not blocked invitation from organisation"),

        ORGANISATION_USER_JOIN_REQUEST_EXIST(426, "User has requested to join organisation"),
        ORGANISATION_USER_JOIN_REQUEST_DOES_NOT_EXIST(427, "User has not requested to join organisation"),
        ORGANISATION_USER_JOIN_REQUEST_BLOCKED(428, "Organisation has blocked join request from user"),
        ORGANISATION_USER_JOIN_REQUEST_BLOCKED_DOES_NOT_EXIST(429, "User has not blocked invitation from organisation"),

        PRODUCT_CREATE_PRODUCT_REQUIRES_PAID_SUBSCRIPTION(000, "Create product requires paid subscription"),
        PRODUCT_ID_INVALID_OR_MISSING(000, "Product id is invalid or missing"),
        PRODUCT_EDIT_PERMISSION_DENIED(000, "Product edit permission denied"),
        PRODUCT_CHILD_PRODUCT_LINK_EXIST_IN_SUPPLY_CHAIN(000, "Product child product link exist in supply chain"),
        PRODUCT_CHILD_PRODUCT_LINK_EXIST(000, "Product child product link exist"),
        PRODUCT_CHILD_PRODUCT_LINK_REQUEST_EXIST(000, "Product child product link request exist"),
        PRODUCT_CHILD_PRODUCT_LINK_DOES_NOT_EXIST(000, "Product child product link does not exist"),
        PRODUCT_CHILD_PRODUCT_LINK_REQUEST_NOT_EXIS(000, "Product child product link request does not exist"),
        PRODUCT_CHILD_PRODUCT_ID_INVALID_OR_EMPTY(000, "Product child product id is invalid or empty"),

        SITE_CREATE_SITE_REQUIRES_PAID_SUBSCRIPTION(000, "Create site requires paid subscription"),
        SITE_ID_INVALID_OR_MISSING(000, "Site id is invalid or missing"),
        SITE_OKID_INVALID_OR_MISSING(000, "Site OKID is invalid or missing"),
        SITE_EDIT_PERMISSION_DENIED(000, "Site edit permission denied"),
        SITE_IDENTIFIER_INVALID_OR_EMPTY(000, "Site identifier is invalid or missing"),
        SITE_IDENTIFIER_MAX_LENGTH_64(000, "Site identifier is over 64 characters limit"),
        SITE_CHILD_SITE_LINK_EXIST_IN_SUPPLY_CHAIN(000, "Site child site link exist in supply chain"),
        SITE_CHILD_SITE_LINK_EXIST(000, "Site child site link exist"),
        SITE_CHILD_SITE_LINK_REQUEST_EXIST(000, "Site child site link request exist"),
        SITE_CHILD_SITE_LINK_DOES_NOT_EXIST(000, "Site child site link does not exist"),
        SITE_CHILD_SITE_LINK_REQUEST_NOT_EXIS(000, "Site child site link request does not exist"),
        SITE_CHILD_SITE_ID_INVALID_OR_EMPTY(000, "Site child site id is invalid or empty"),

        CONTACT_ID_INVALID_OR_EMPTY(000, "Contact id is invalid or empty"),
        CONTACT_TYPE_IS_NOT_MANUAL(000, "Contact type is note manual"),
        CONTACT_TYPE_IS_NOT_LINKED(000, "Contact type is note linked"),
        CONTACT_LINK_EXIST(000, "Contact link exist"),
        CONTACT_LINK_DOES_NOT_EXIST(000, "Contact link does not exist"),

        INSPECTION_ASSET_ID_INVALID_OR_EMPTY(000, "Inspection asset id is invalid or empty"),
        INSPECTION_REFID_INVALID_OR_EMPTY(000, "Inspection REFID is invalid or empty"),
        INSPECTION_ASSET_LINK_EXIST(000, "Inspection is already linked"),
        INSPECTION_ASSET_LINK_DOES_NOT_EXIST(000, "Inspection is not linked"),
        INSPECTION_IS_NOT_AUTHORIZED_TO_START_INSPECTION(000, "User is not authorized to start inspection"),

        INSPECTION_TEST_ASSET_ID_INVALID_OR_EMPTY(000, "Test asset id is invalid or empty"),
        INSPECTION_TARGET_TEST_ASSET_ID_INVALID_OR_EMPTY(000, "Target test asset id is invalid or empty"),
        INSPECTION_TEST_REFID_INVALID_OR_EMPTY(000, "Test REFID is invalid or empty"),
        INSPECTION_TEST_REQUIRES_ENGLISH_WHAT_TO_LOOK_FOR(000, "Test requires english what to look for"),
        INSPECTION_TEST_ASSET_LINK_EXIST(000, "Test is already linked"),
        INSPECTION_TARGET_TEST_ASSET_LINK_EXIST(000, "Target test is already linked"),
        INSPECTION_TEST_TARGET_ORDER_INVALID(000, "Test target order is invalid"),
        INSPECTION_TEST_ASSET_HAS_EXISTING_LINKS(000, "Test is linked on other asset"),

        INSPECTION_LOG_USER_HAS_INPROGRESS_INSPECTION_LOG(000, "User has inprogress inspection log"),
        INSPECTION_LOG_PERMISSION_DENIED(000, "Inspection log permission denied"),
        INSPECTION_LOG_ID_INVALID_OR_EMPTY(000, "Inspection log id is invalid or empty"),
        INSPECTION_LOG_REFID_INVALID_OR_EMPTY(000, "Inspection log REFID is invalid or empty"),
        INSPECTION_LOG_ITEM_ID_NOT_UNDER_SAME_PRODUCT(000, "Item id is not under same product"),
        INSPECTION_LOG_INVALID_LOT_SIZE(000, "Inspection log invalid lot size"),
        INSPECTION_LOG_INVALID_INSPECTED_SIZE(000, "Inspection log invalid inspected size"),
        INSPECTION_LOG_INVALID_PASSED_AS_FLAWLESS(000, "Inspection log invalid passed as flawless"),
        INSPECTION_LOG_INVALID_PASSED_AS_FIXED(000, "Inspection log invalid passed as fixed"),
        INSPECTION_LOG_INVALID_PASSED_AS_TOLERATED(000, "Inspection log invalid passed as tolerated"),
        INSPECTION_LOG_INVALID_REJECTED(000, "Inspection log invalid rejected"),

        INSPECTION_LOG_TEST_ASSET_PERMISSION_DENIED(000, "Inspection log test asset permission denied"),
        INSPECTION_LOG_TEST_ASSET_ID_INVALID_OR_EMPTY(000, "Inspection log test asset id is invalid or empty"),
        INSPECTION_LOG_TEST_ASSET_ALREADY_LINKED(000, "Inspection log test asset is already linked"),
        INSPECTION_LOG_TEST_ASSET_INVALID_PASSED_OR_FAILED(000, "Inspection log test asset invalid passed or failed"),
        INSPECTION_LOG_TEST_ASSET_INVALID_FIXED_OR_TOLERATED(000,
                        "Inspection log test asset invalid fixed or tolerated"),
        INSPECTION_LOG_TEST_ASSET_INVALID_PASSED(000, "Inspection log test asset invalid passed"),
        INSPECTION_LOG_TEST_ASSET_INVALID_FAILED(000, "Inspection log test asset invalid failed"),
        INSPECTION_LOG_TEST_ASSET_INVALID_FIXED(000, "Inspection log test asset invalid fixed"),
        INSPECTION_LOG_TEST_ASSET_INVALID_TOLERATED(000, "Inspection log test asset invalid tolerated"),
        INSPECTION_LOG_TEST_ASSET_REQUIRES_ENGLISH_WHAT_TO_LOOK_FOR(000,
                        "Inspection log test asset requires english what to look for"),

        INSPECTION_LOG_NOTE_ASSET_PERMISSION_DENIED(000, "Inspection log note asset permission denied"),
        INSPECTION_LOG_NOTE_ASSET_ID_INVALID_OR_EMPTY(000, "Inspection log note asset id is invalid or empty"),

        INSPECTION_LOG_MEDIA_ASSET_PERMISSION_DENIED(000, "Inspection log media asset permission denied"),
        INSPECTION_LOG_MEDIA_ASSET_ID_INVALID_OR_EMPTY(000, "Inspection log media asset id is invalid or empty"),
        INSPECTION_LOG_MEDIA_ASSET_ALREADY_LINKED(000, "Inspection log media asset is already linked"),

        PRODUCT_ITEM_ID_INVALID_OR_EMPTY(000, "Item id is invalid or empty"),
        PRODUCT_ITEM_OKID_INVALID_OR_EMPTY(000, "Item OKID is invalid or empty"),
        PRODUCT_ITEM_ALTERNATE_ID_INVALID_OR_EMPTY(000, "Item alternate id is invalid or empty"),
        PRODUCT_ITEM_ALTERNATE_ID_MAX_LENGTH_64(000, "Item alternate id is over 64 characters limit"),

        LABEL_INVALID_OR_EMPTY_ID(000, "Label id invalid or empty"),
        LABEL_INVALID_OR_EMPTY_REFID(000, "Label REFID invalid or empty"),

        LABEL_TEMPLATE_INVALID_OR_EMPTY_ID(000, "Label template id invalid or empty"),
        LABEL_TEMPLATE_INVALID_OR_EMPTY_TYPE(000, "Label template type invalid or empty"),
        LABEL_TEMPLATE_INVALID_OR_EMPTY_SIZE(000, "Label template size invalid or empty"),
        LABEL_TEMPLATE_INVALID_OR_EMPTY_MATERIAL(000, "Label template material invalid or empty"),
        LABEL_TEMPLATE_INVALID_OR_EMPTY_CORNERS(000, "Label template corners invalid or empty"),
        LABEL_TEMPLATE_INVALID_OR_EMPTY_EYELET(000, "Label template eyelet invalid or empty"),
        LABEL_TEMPLATE_INVALID_OR_EMPTY_LANGUAGE_CODE(000, "Label template language code invalid or empty"),
        LABEL_TEMPLATE_HAS_EXISTING_LINKS(000, "Lable template is linked on at least one label"),

        ORDER_CREATE_ORDER_REQUIRES_PAID_SUBSCRIPTION(000, "Create order requires paid subscription"),
        ORDER_ID_INVALID_OR_MISSING(000, "Order id is invalid or missing"),
        ORDER_IDENTIFIER_INVALID_OR_EMPTY(000, "Order identifier is invalid or missing"),
        ORDER_IDENTIFIER_MAX_LENGTH_64(000, "Order identifier is over 64 characters limit"),
        ORDER_EDIT_PERMISSION_DENIED(000, "Order edit permission denied"),
        ORDER_CHILD_ORDER_LINK_EXIST_IN_SUPPLY_CHAIN(000, "Order child order link exist in supply chain"),
        ORDER_CHILD_ORDER_LINK_EXIST(000, "Order child order link exist"),
        ORDER_CHILD_ORDER_LINK_REQUEST_EXIST(000, "Order child order link request exist"),
        ORDER_CHILD_ORDER_LINK_DOES_NOT_EXIST(000, "Order child order link does not exist"),
        ORDER_CHILD_ORDER_LINK_REQUEST_NOT_EXIS(000, "Order child order link request does not exist"),
        ORDER_CHILD_ORDER_ID_INVALID_OR_EMPTY(000, "Order child order id is invalid or empty"),
        ORDER_INSPECTION_LOG_LINK_EXIST(000, "Order is already linked on log"),
        ORDER_INSPECTION_LOG_LINK_DOES_NOT_EXIST(000, "Order is not linked on log"),
        ORDER_SITE_LINK_EXIST(000, "Site is already linked on order"),
        ORDER_SITE_LINK_DOES_NOT_EXIST(000, "Site is not linked on order"),

        UTILITY_NOTE_ASSET_ID_INVALID_OR_EMPTY(701, "Node asset id is invalid or empty"),
        UTILITY_CREATE_NOTE_ASSET_LANGUAGE_TEXT_INPUT_LIST_INVALID_OR_EMPTY(702,
                        "Language text input list is invalid or empty"),
        UTILITY_CREATE_NOTE_ASSET_LANGUAGE_TEXT_INPUT_LIST_MISSING_ENGLISH(703,
                        "Language text input list is missing english"),
        UTILITY_NOTE_ASSET_HAS_EXISTING_LINKS(704, "Node asset is linked on other asset"),
        UTILITY_ASSET_LINK_PRODUCT_ID_OR_NOTE_ASSET_ID_INVALID_OR_EMPTY(705,
                        "Product id or note asset id is invalid or empty"),
        UTILITY_ASSET_LINK_SITE_ID_OR_NOTE_ASSET_ID_INVALID_OR_EMPTY(705,
                        "Site id or note asset id is invalid or empty"),
        UTILITY_NOTE_ASSET_LINK_EXIST(706, "Note asset is already linked"),
        UTILITY_NOTE_ASSET_PUBLISH_CONTROL_GLOBAL(707, "Note asset publish status controlled at global level"),
        UTILITY_NOTE_ASSET_REQUIRES_ENGLISH(708, "Note asset requires english text"),

        UTILITY_DOCUMENT_ASSET_ID_INVALID_OR_EMPTY(711, "Document asset id is invalid or empty"),
        UTILITY_DOCUMENT_ASSET_REFID_INVALID_OR_EMPTY(711, "Document asset REFID is invalid or empty"),
        UTILITY_CREATE_DOCUMENT_ASSET_TYPE_INVALID_OR_EMPTY(712, "Document asset type is invalid or empty"),
        UTILITY_CREATE_DOCUMENT_FILE_FORMAT_INVALID_OR_EMPTY(713, "Document file format is invalid or empty"),
        UTILITY_DOCUMENT_ASSET_HAS_EXISTING_LINKS(714, "Document asset is linked on other asset"),
        UTILITY_ASSET_LINK_PRODUCT_ID_OR_DOCUMENT_ASSET_ID_INVALID_OR_EMPTY(715,
                        "Product id or document asset id is invalid or empty"),
        UTILITY_ASSET_LINK_SITE_ID_OR_DOCUMENT_ASSET_ID_INVALID_OR_EMPTY(715,
                        "Site id or document asset id is invalid or empty"),
        UTILITY_ASSET_LINK_ORDER_ID_OR_DOCUMENT_ASSET_ID_INVALID_OR_EMPTY(715,
                        "Order id or document asset id is invalid or empty"),
        UTILITY_ASSET_LINK_INSPECTION_LOG_ID_OR_DOCUMENT_ASSET_ID_INVALID_OR_EMPTY(715,
                        "Inspection log id or document asset id is invalid or empty"),
        UTILITY_DOCUMENT_ASSET_LINK_EXIST(716, "Document asset is already linked"),
        UTILITY_DOCUMENT_ASSET_PUBLISH_CONTROL_GLOBAL(717, "Document asset publish status controlled at global level"),
        UTILITY_DOCUMENT_ASSET_EDIT_PERMISSION_DENIED(718, "Document asset edit denied"),
        UTILITY_USER_DOCUMENT_ASSET_ID_INVALID_OR_EMPTY(719, "User document asset id is invalid or empty"),
        UTILITY_USER_DOCUMENT_ASSET_TYPE_INVALID_OR_EMPTY(720, "User document asset type is invalid or empty"),

        UTILITY_MEDIA_ASSET_FAILED_REQUEST(000, "Failed Request"),

        UTILITY_MEDIA_ASSET_ID_INVALID_OR_EMPTY(721, "Media asset id is invalid or empty"),
        UTILITY_CREATE_MEDIA_ASSET_TYPE_INVALID_OR_EMPTY(722, "Media asset type is invalid or empty"),
        UTILITY_CREATE_MEDIA_FILE_FORMAT_INVALID_OR_EMPTY(723, "Media file format is invalid or empty"),
        UTILITY_MEDIA_ASSET_HAS_EXISTING_LINKS(724, "Media asset is linked on other asset"),
        UTILITY_ASSET_LINK_PRODUCT_ID_OR_MEDIA_ASSET_ID_INVALID_OR_EMPTY(725,
                        "Product id of media asset id is invalid or empty"),
        UTILITY_ASSET_LINK_SITE_ID_OR_MEDIA_ASSET_ID_INVALID_OR_EMPTY(725,
                        "Site id of media asset id is invalid or empty"),
        UTILITY_MEDIA_ASSET_LINK_EXIST(726, "Media asset is already linked"),
        UTILITY_MEDIA_ASSET_PUBLISH_CONTROL_GLOBAL(727, "Media asset publish status controlled at global level"),

        UTILITY_FILE_UPLOAD_FAILED(791, "File upload failed"),
        UTILITY_FILE_DOWNLOAD_FAILED(791, "File download failed"),

        RTD_COMMENT_ID_INVALID_OR_MISSING(000, "Comment id is invalid or missing"),
        RTD_COMMENT_LIKE_RECORD_EXISTS(000, "Comment like record exists"),
        RTD_COMMENT_LIKE_RECORD_DOES_NOT_EXIST(000, "Comment like record does not exist"),

        SOURCE_TYPE_OR_SOURCE_ID_INVALID(000, "Source type or source is invalid or empty"),
        SOURCE_TYPE_INVALID(000, "Source type is invalid"),
        SOURCE_ID_INVALID_OR_EMPTY(000, "Source id is invalid or empty"),

        REQUEST_FAILED(999, "Request failed");

        private final Integer errorCode;
        private final String errorMessage;

        EResponseError(Integer errorCode, String errorMessage) {
                this.errorCode = errorCode;
                this.errorMessage = errorMessage;
        }

}
