import unittest
from ansible.modules.replace import *


class TestReplaceModule(unittest.TestCase):
    def test_check_file_attrs(self):
        module = AnsibleModule()
        changed = False
        message = "Initial message"
        result = check_file_attrs(module, changed, message)
        self.assertEqual(result[0], "Initial message")
        self.assertFalse(result[1])

    def test_check_file_attrs_changed(self):
        module = AnsibleModule()
        changed = True
        message = "Initial message"
        result = check_file_attrs(module, changed, message)
        self.assertEqual(result[0], "Initial message and ownership, perms or SE linux context changed")
        self.assertTrue(result[1])

    def test_replace_module(self):
        module = AnsibleModule()
        module.params = {"path": "/etc/hosts", "regexp": "(\\s+)old\\.host\\.name(\\s+.*)?$", "replace": "\\1new.host.name\\2"}
        result = module.run()
        self.assertEqual(result["changed"], True)

    def test_replace_module_after(self):
        module = AnsibleModule()
        module.params = {"path": "/etc/apache2/sites-available/default.conf", "after": 'NameVirtualHost [*]', "regexp": '^(.+)$', "replace": ''}
        result = module.run()
        self.assertEqual(result["changed"], True)

    def test_replace_module_no_change(self):
        module = AnsibleModule()
        module.params = {"path": "/etc/hosts", "regexp": "(\\s+)old\\.host\\.name(\\s+.*)?$", "replace": "\\1new.host.name\\2"}
        result = module.run()
        self.assertEqual(result["changed"], True)

    def test_replace_module_no_change_after(self):
        module = AnsibleModule()
        module.params = {"path": "/etc/apache2/sites-available/default.conf", "after": 'NameVirtualHost [*]', "regexp": '^(.+)$', "replace": ''}
        result = module.run()
        self.assertEqual(result["changed"], True)

if __name__ == '__main__':
    unittest.main()