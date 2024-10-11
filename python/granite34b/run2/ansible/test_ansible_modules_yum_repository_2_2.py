import os
import tempfile
import unittest
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils._text import to_native
from ansible.module_utils.six.moves import configparser
import yum_repository


class TestYumRepo(unittest.TestCase):
    def setUp(self):
        self.module = AnsibleModule(
            argument_spec=YumRepo.argument_spec,
            supports_check_mode=True,
        )
        self.params = {
            'repoid': 'testrepo',
            'reposdir': tempfile.gettempdir(),
            'file': 'testrepo.repo',
            'description': 'Test repository',
            'baseurl': 'http://example.com/testrepo',
            'enabled': True,
            'gpgcheck': False,
        }
        self.yumrepo = YumRepo(self.module)

    def test_add_repo(self):
        self.yumrepo.add()
        self.assertTrue(self.yumrepo.repofile.has_section(self.params['repoid']))
        self.assertEqual(self.yumrepo.repofile.get(self.params['repoid'], 'baseurl'), self.params['baseurl'])
        self.assertEqual(self.yumrepo.repofile.getboolean(self.params['repoid'], 'enabled'), self.params['enabled'])
        self.assertEqual(self.yumrepo.repofile.getboolean(self.params['repoid'], 'gpgcheck'), self.params['gpgcheck'])

    def test_remove_repo(self):
        self.yumrepo.add()
        self.yumrepo.remove()
        self.assertFalse(self.yumrepo.repofile.has_section(self.params['repoid']))

if __name__ == '__main__':
    unittest.main()