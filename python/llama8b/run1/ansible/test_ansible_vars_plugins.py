import unittest
from ansible.vars.plugins import get_plugin_vars, get_vars_from_path, get_vars_from_inventory_sources
from ansible.module_utils._text import to_bytes
from ansible.inventory.host import Host
from ansible.utils.collection_loader import AnsibleCollectionRef
from ansible.utils.display import Display
from ansible.utils.vars import combine_vars
from ansible import constants as C
from ansible.errors import AnsibleError
from ansible.module_utils._text import to_text
from ansible.module_utils.basic import env_fallback
from ansible.module_utils._text import to_native


if __name__ == '__main__':
    unittest.main()