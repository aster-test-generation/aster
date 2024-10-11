import os
import unittest
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.six.moves import configparser
from ansible.module_utils._text import to_native
import yum_repository


class TestYumRepo(unittest.TestCase):
    def setUp(self):
        self.module = AnsibleModule(
            argument_spec=dict(
                # Define the argument spec here
            ),
            supports_check_mode=True
        )
        self.params = {
            # Define the parameters here
        }
        self.yum_repo = YumRepo(self.module)

    def test_add_repo(self):
        self.yum_repo.add()
        self.assertTrue(self.repofile.has_section(self.section))
        for key, value in self.params.items():
            if key in self.yum_repo.list_params and isinstance(value, list):
                value = ' '.join(value)
            elif isinstance(value, bool):
                value = int(value)
            if value is not None and key in self.yum_repo.allowed_params:
                self.assertEqual(self.repofile.get(self.section, key), value)

    def test_remove_repo(self):
        self.yum_repo.remove()
        self.assertFalse(self.repofile.has_section(self.section))

    def test_get_repo(self):
        repo = self.yum_repo.get()
        self.assertEqual(repo, self.params)

    def test_update_repo(self):
        self.yum_repo.update()
        for key, value in self.params.items():
            if key in self.yum_repo.list_params and isinstance(value, list):
                value = ' '.join(value)
            elif isinstance(value, bool):
                value = int(value)
            if value is not None and key in self.yum_repo.allowed_params:
                self.assertEqual(self.repofile.get(self.section, key), value)

if __name__ == '__main__':
    unittest.main()