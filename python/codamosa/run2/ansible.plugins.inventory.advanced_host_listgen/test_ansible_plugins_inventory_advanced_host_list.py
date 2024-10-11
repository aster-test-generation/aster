# Automatically generated by Pynguin.
import ansible.plugins.inventory.advanced_host_list as module_0

def test_case_0():
    inventory_module_0 = module_0.InventoryModule()
    inventory_module_1 = module_0.InventoryModule()

def test_case_1():
    inventory_module_0 = module_0.InventoryModule()
    str_0 = '<z=zh'
    var_0 = inventory_module_0.verify_file(str_0)

def test_case_2():
    str_0 = '\nansible_facts:\n  description: Facts to add to ansible_facts.\n  returned: always\n  type: complex\n  contains:\n    packages:\n      description:\n        - Maps the package name to a non-empty list of dicts with package information.\n        - Every dict in the list corresponds to one installed version of the package.\n        - The fields described below are present for all package managers. Depending on the\n          package manager, there might be more fields for a package.\n      returned: when operating system level package manager is specified or auto detected manager\n      type: dict\n      contains:\n        name:\n          description: The package\'s name.\n          returned: always\n          type: str\n        version:\n          description: The package\'s version.\n          returned: always\n          type: str\n        source:\n          description: Where information on the package came from.\n          returned: always\n          type: str\n      sample: |-\n        {\n          "packages": {\n            "kernel": [\n              {\n                "name": "kernel",\n                "source": "rpm",\n                "version": "3.10.0",\n                ...\n              },\n              {\n                "name": "kernel",\n                "source": "rpm",\n                "version": "3.10.0",\n                ...\n              },\n              ...\n            ],\n            "kernel-tools": [\n              {\n                "name": "kernel-tools",\n                "source": "rpm",\n                "version": "3.10.0",\n                ...\n              }\n            ],\n            ...\n          }\n        }\n        # Sample rpm\n        {\n          "packages": {\n            "kernel": [\n              {\n                "arch": "x86_64",\n                "epoch": null,\n                "name": "kernel",\n                "release": "514.26.2.el7",\n                "source": "rpm",\n                "version": "3.10.0"\n              },\n              {\n                "arch": "x86_64",\n                "epoch": null,\n                "name": "kernel",\n                "release": "514.16.1.el7",\n                "source": "rpm",\n                "version": "3.10.0"\n              },\n              {\n                "arch": "x86_64",\n                "epoch": null,\n                "name": "kernel",\n                "release": "514.10.2.el7",\n                "source": "rpm",\n                "version": "3.10.0"\n              },\n              {\n                "arch": "x86_64",\n                "epoch": null,\n                "name": "kernel",\n                "release": "514.21.1.el7",\n                "source": "rpm",\n                "version": "3.10.0"\n              },\n              {\n                "arch": "x86_64",\n                "epoch": null,\n                "name": "kernel",\n                "release": "693.2.2.el7",\n                "source": "rpm",\n                "version": "3.10.0"\n              }\n            ],\n            "kernel-tools": [\n              {\n                "arch": "x86_64",\n                "epoch": null,\n                "name": "kernel-tools",\n                "release": "693.2.2.el7",\n                "source": "rpm",\n                "version": "3.10.0"\n              }\n            ],\n            "kernel-tools-libs": [\n              {\n                "arch": "x86_64",\n                "epoch": null,\n                "name": "kernel-tools-libs",\n                "release": "693.2.2.el7",\n                "source": "rpm",\n                "version": "3.10.0"\n              }\n            ],\n          }\n        }\n        # Sample deb\n        {\n          "packages": {\n            "libbz2-1.0": [\n              {\n                "version": "1.0.6-5",\n                "source": "apt",\n                "arch": "amd64",\n                "name": "libbz2-1.0"\n              }\n            ],\n            "patch": [\n              {\n                "version": "2.7.1-4ubuntu1",\n                "source": "apt",\n                "arch": "amd64",\n                "name": "patch"\n              }\n            ],\n          }\n        }\n'
    inventory_module_0 = module_0.InventoryModule()
    var_0 = inventory_module_0.verify_file(str_0)

def test_case_3():
    inventory_module_0 = module_0.InventoryModule()
    inventory_module_1 = module_0.InventoryModule()
    var_0 = None
    var_1 = None
    str_0 = 'host[1:0],'
    bool_0 = False
    var_2 = inventory_module_1.parse(var_0, var_1, str_0, bool_0)