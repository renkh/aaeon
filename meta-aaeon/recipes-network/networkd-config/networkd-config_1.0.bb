SUMMARY = "Networkd Configuration Files"
SECTION = "net/config"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = ""

SRC_URI:append = " \
    file://75-eth0.network \
"

S = "${WORKDIR}"

do_install() {
    install -m 0755 -d ${D}${systemd_unitdir}/network
}

do_install:append() {
    install -m 0644 ${S}/75-eth0.network ${D}${systemd_unitdir}/network
}

FILES:${PN} += "${systemd_unitdir}/network"
