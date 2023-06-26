SUMMARY = "AAEON Core image packagegroups"

inherit packagegroup

PROVIDES = "${PACKAGES}"
PACKAGES = " \
    ${PN} \
    ${PN}-development \
"

RDEPENDS:${PN} = " \
    networkd-config \
"

RDEPENDS:${PN}-development = " \
    ${PN} \
    \
    packagegroup-aaeon-core-development \
"
