SUMMARY = "AAEON Development OS Image"
LICENSE = "MIT"

require recipes-core/images/aaeon-image-common.inc

IMAGE_INSTALL += " \
    packagegroup-aaeon-image-development \
"
