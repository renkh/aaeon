SUMMARY = "AAEON Core packagegroups"

inherit packagegroup

PROVIDES = "${PACKAGES}"
PACKAGES = " \
    ${PN} \
    ${PN}-development \
    ${PN}-kernel-tools \
    ${PN}-kernel-development \
    ${PN}-development-tools \
    ${PN}-sys-debug \
    ${PN}-editors \
    ${PN}-time-sync \
"

RDEPENDS:${PN} = " \
    ${PN}-time-sync \
"

RDEPENDS:${PN}-development = " \
    ${PN}-kernel-tools \
    ${PN}-kernel-development \
    ${PN}-sys-debug \
    ${PN}-development-tools \
    ${PN}-editors \
    \
    packagegroup-sdk-target \
"

RDEPENDS:${PN}-kernel-tools = " \
    kexec-tools \
    kdump \
    crash \
    makedumpfile \
    dtc \
"

RDEPENDS:${PN}-kernel-development = " \
    ${PN}-kernel-tools \
    \
    kernel-dev \
    kernel-devsrc \
    kernel-devsrc-dbg \
"

RDEPENDS:${PN}-development-tools = " \
    git \
    xz \
"

RDEPENDS:${PN}-sys-debug = " \
    gdb \
    stress-ng \
    ldd \
"

RDEPENDS:${PN}-editors = " \
    nano \
    vim \
"

# NTP support via the chrony daemon
RDEPENDS:${PN}-time-sync = " \
    chrony \
    chronyc \
"
