package com.example.cerego

import com.google.gson.annotations.SerializedName

data class ceregoResponse(
    @SerializedName("meta")
    var meta: Meta?,
    @SerializedName("response")
    var response: Response?
)

data class Meta(
    @SerializedName("message")
    var message: String?,
    @SerializedName("status")
    var status: Int?
)

data class Response(
    @SerializedName("sets")
    var sets: List<Set?>?,
    @SerializedName("sets_count")
    var setsCount: Int?
)

data class Set(
    @SerializedName("categories")
    var categories: List<Category?>?,
    @SerializedName("content_updated_at")
    var contentUpdatedAt: String?,
    @SerializedName("created_at")
    var createdAt: String?,
    @SerializedName("creator")
    var creator: Creator?,
    @SerializedName("description")
    var description: Any?,
    @SerializedName("description_html")
    var descriptionHtml: Any?,
    @SerializedName("facets_count")
    var facetsCount: Int?,
    @SerializedName("foreign_language")
    var foreignLanguage: ForeignLanguage?,
    @SerializedName("goal_type")
    var goalType: String?,
    @SerializedName("guid")
    var guid: String?,
    @SerializedName("id")
    var id: Int?,
    @SerializedName("image")
    var image: ImageXXX?,
    @SerializedName("is_featured")
    var isFeatured: Boolean?,
    @SerializedName("items_count")
    var itemsCount: Int?,
    @SerializedName("language")
    var language: Language?,
    @SerializedName("learn_version")
    var learnVersion: Int?,
    @SerializedName("main_category")
    var mainCategory: MainCategory?,
    @SerializedName("memories_count")
    var memoriesCount: Int?,
    @SerializedName("module_type")
    var moduleType: String?,
    @SerializedName("name")
    var name: String?,
    @SerializedName("parent_set_id")
    var parentSetId: Any?,
    @SerializedName("partner_id")
    var partnerId: Any?,
    @SerializedName("permissions")
    var permissions: Permissions?,
    @SerializedName("privacy_type")
    var privacyType: PrivacyType?,
    @SerializedName("remixable_type")
    var remixableType: Any?,
    @SerializedName("remixed_only")
    var remixedOnly: Any?,
    @SerializedName("scorm_package_id")
    var scormPackageId: Any?,
    @SerializedName("slug")
    var slug: String?,
    @SerializedName("studiable_items_count")
    var studiableItemsCount: Int?,
    @SerializedName("studiable_memories_count")
    var studiableMemoriesCount: Int?,
    @SerializedName("updated_at")
    var updatedAt: String?
)

data class Category(
    @SerializedName("id")
    var id: Int?,
    @SerializedName("parent_id")
    var parentId: Int?,
    @SerializedName("slug")
    var slug: String?,
    @SerializedName("title")
    var title: String?
)

data class Creator(
    @SerializedName("id")
    var id: Int?,
    @SerializedName("name")
    var name: String?,
    @SerializedName("primary_partner")
    var primaryPartner: PrimaryPartner?,
    @SerializedName("username")
    var username: String?
)

data class PrimaryPartner(
    @SerializedName("bg_class")
    var bgClass: String?,
    @SerializedName("description")
    var description: String?,
    @SerializedName("facebook_url")
    var facebookUrl: Any?,
    @SerializedName("id")
    var id: Int?,
    @SerializedName("image")
    var image: Image?,
    @SerializedName("ios_brand_image")
    var iosBrandImage: IosBrandImage?,
    @SerializedName("is_self_serve")
    var isSelfServe: Boolean?,
    @SerializedName("login_image_bottom")
    var loginImageBottom: String?,
    @SerializedName("login_image_top")
    var loginImageTop: String?,
    @SerializedName("logo_image")
    var logoImage: LogoImage?,
    @SerializedName("module_overlay_image")
    var moduleOverlayImage: String?,
    @SerializedName("name")
    var name: String?,
    @SerializedName("partner_settings")
    var partnerSettings: PartnerSettings?,
    @SerializedName("permission")
    var permission: Permission?,
    @SerializedName("slug")
    var slug: String?,
    @SerializedName("twitter_url")
    var twitterUrl: Any?,
    @SerializedName("website_url")
    var websiteUrl: Any?
)

data class Image(
    @SerializedName("alt_tag")
    var altTag: Any?,
    @SerializedName("created_at")
    var createdAt: String?,
    @SerializedName("expires_at")
    var expiresAt: String?,
    @SerializedName("id")
    var id: Int?,
    @SerializedName("large_url")
    var largeUrl: Any?,
    @SerializedName("license_id")
    var licenseId: Any?,
    @SerializedName("medium_url")
    var mediumUrl: Any?,
    @SerializedName("orig_owner")
    var origOwner: Any?,
    @SerializedName("orig_url")
    var origUrl: Any?,
    @SerializedName("small_url")
    var smallUrl: Any?,
    @SerializedName("updated_at")
    var updatedAt: String?,
    @SerializedName("url")
    var url: String?
)

data class IosBrandImage(
    @SerializedName("image")
    var image: ImageX?
)

data class ImageX(
    @SerializedName("alt_tag")
    var altTag: Any?,
    @SerializedName("created_at")
    var createdAt: String?,
    @SerializedName("expires_at")
    var expiresAt: String?,
    @SerializedName("id")
    var id: Int?,
    @SerializedName("large_url")
    var largeUrl: Any?,
    @SerializedName("license_id")
    var licenseId: Any?,
    @SerializedName("medium_url")
    var mediumUrl: Any?,
    @SerializedName("orig_owner")
    var origOwner: Any?,
    @SerializedName("orig_url")
    var origUrl: Any?,
    @SerializedName("small_url")
    var smallUrl: Any?,
    @SerializedName("updated_at")
    var updatedAt: String?,
    @SerializedName("url")
    var url: String?
)

data class LogoImage(
    @SerializedName("image")
    var image: ImageXX?
)

data class ImageXX(
    @SerializedName("alt_tag")
    var altTag: Any?,
    @SerializedName("created_at")
    var createdAt: String?,
    @SerializedName("expires_at")
    var expiresAt: String?,
    @SerializedName("id")
    var id: Int?,
    @SerializedName("large_url")
    var largeUrl: Any?,
    @SerializedName("license_id")
    var licenseId: Any?,
    @SerializedName("medium_url")
    var mediumUrl: Any?,
    @SerializedName("orig_owner")
    var origOwner: Any?,
    @SerializedName("orig_url")
    var origUrl: Any?,
    @SerializedName("small_url")
    var smallUrl: Any?,
    @SerializedName("updated_at")
    var updatedAt: String?,
    @SerializedName("url")
    var url: String?
)

data class PartnerSettings(
    @SerializedName("account_management_enabled")
    var accountManagementEnabled: Boolean?,
    @SerializedName("cca_enabled")
    var ccaEnabled: Boolean?,
    @SerializedName("custom_tag_enabled")
    var customTagEnabled: Boolean?,
    @SerializedName("default_goal")
    var defaultGoal: Double?,
    @SerializedName("departments_enabled")
    var departmentsEnabled: Boolean?,
    @SerializedName("email_domain_whitelisting_enabled")
    var emailDomainWhitelistingEnabled: Boolean?,
    @SerializedName("join_url_enabled")
    var joinUrlEnabled: Boolean?,
    @SerializedName("learn_version")
    var learnVersion: Int?,
    @SerializedName("library_enabled")
    var libraryEnabled: Boolean?,
    @SerializedName("member_id_enabled")
    var memberIdEnabled: Boolean?,
    @SerializedName("member_id_slug")
    var memberIdSlug: String?,
    @SerializedName("partner_id")
    var partnerId: Int?,
    @SerializedName("password_prefix")
    var passwordPrefix: String?,
    @SerializedName("payments_currency")
    var paymentsCurrency: String?,
    @SerializedName("payments_enabled")
    var paymentsEnabled: Boolean?,
    @SerializedName("payments_required")
    var paymentsRequired: Boolean?,
    @SerializedName("price")
    var price: Double?,
    @SerializedName("report_lms_id")
    var reportLmsId: Boolean?,
    @SerializedName("scorm_set_creation_enabled")
    var scormSetCreationEnabled: Boolean?,
    @SerializedName("standing_enabled")
    var standingEnabled: Boolean?
)

class Permission(
)

data class ForeignLanguage(
    @SerializedName("code")
    var code: String?,
    @SerializedName("english_name")
    var englishName: String?,
    @SerializedName("id")
    var id: Int?,
    @SerializedName("name")
    var name: String?,
    @SerializedName("native_name")
    var nativeName: String?
)

data class ImageXXX(
    @SerializedName("alt_tag")
    var altTag: Any?,
    @SerializedName("created_at")
    var createdAt: String?,
    @SerializedName("expires_at")
    var expiresAt: String?,
    @SerializedName("id")
    var id: Int?,
    @SerializedName("large_url")
    var largeUrl: Any?,
    @SerializedName("license_id")
    var licenseId: Int?,
    @SerializedName("medium_url")
    var mediumUrl: Any?,
    @SerializedName("orig_owner")
    var origOwner: String?,
    @SerializedName("orig_url")
    var origUrl: String?,
    @SerializedName("small_url")
    var smallUrl: Any?,
    @SerializedName("updated_at")
    var updatedAt: String?,
    @SerializedName("url")
    var url: String?
)

data class Language(
    @SerializedName("code")
    var code: String?,
    @SerializedName("english_name")
    var englishName: String?,
    @SerializedName("id")
    var id: Int?,
    @SerializedName("name")
    var name: String?,
    @SerializedName("native_name")
    var nativeName: String?
)

data class MainCategory(
    @SerializedName("id")
    var id: Int?,
    @SerializedName("parent_id")
    var parentId: Int?,
    @SerializedName("slug")
    var slug: String?,
    @SerializedName("title")
    var title: String?
)

data class Permissions(
    @SerializedName("editable")
    var editable: Boolean?,
    @SerializedName("group_access")
    var groupAccess: Boolean?,
    @SerializedName("is_owner")
    var isOwner: Boolean?,
    @SerializedName("public_toggleable")
    var publicToggleable: Boolean?
)

data class PrivacyType(
    @SerializedName("id")
    var id: Int?,
    @SerializedName("name")
    var name: String?
)