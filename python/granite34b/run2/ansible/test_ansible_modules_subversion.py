import unittest
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.compat.version import LooseVersion
from ansible.modules.subversion import Subversion


class TestSubversion(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule(argument_spec=dict(dest=dict(type='path'), repo=dict(type='str', required=True, aliases=['name', 'repository']), revision=dict(type='str', default='HEAD', aliases=['rev', 'version']), force=dict(type='bool', default=False), username=dict(type='str'), password=dict(type='str', no_log=True), executable=dict(type='path'), export=dict(type='bool', default=False), checkout=dict(type='bool', default=True), update=dict(type='bool', default=True), switch=dict(type='bool', default=True), in_place=dict(type='bool', default=False), validate_certs=dict(type='bool', default=False)), supports_check_mode=True)
        dest = module.params['dest']
        repo = module.params['repo']
        revision = module.params['revision']
        force = module.params['force']
        username = module.params['username']
        password = module.params['password']
        svn_path = module.params['executable'] or module.get_bin_path('svn', True)
        export = module.params['export']
        switch = module.params['switch']
        checkout = module.params['checkout']
        update = module.params['update']
        in_place = module.params['in_place']
        validate_certs = module.params['validate_certs']
        locale = get_best_parsable_locale(module)
        module.run_command_environ_update = dict(LANG=locale, LC_MESSAGES=locale)
        svn = Subversion(module, dest, repo, revision, username, password, svn_path, validate_certs)
        self.assertEqual(svn.module, module)
        self.assertEqual(svn.dest, dest)
        self.assertEqual(svn.repo, repo)
        self.assertEqual(svn.revision, revision)
        self.assertEqual(svn.force, force)
        self.assertEqual(svn.username, username)
        self.assertEqual(svn.password, password)
        self.assertEqual(svn.svn_path, svn_path)
        self.assertEqual(svn.export, export)
        self.assertEqual(svn.switch, switch)
        self.assertEqual(svn.checkout, checkout)
        self.assertEqual(svn.update, update)
        self.assertEqual(svn.in_place, in_place)
        self.assertEqual(svn.validate_certs, validate_certs)

    def test_get_remote_revision(self):
        module = AnsibleModule(argument_spec=dict(dest=dict(type='path'), repo=dict(type='str', required=True, aliases=['name', 'repository']), revision=dict(type='str', default='HEAD', aliases=['rev', 'version']), force=dict(type='bool', default=False), username=dict(type='str'), password=dict(type='str', no_log=True), executable=dict(type='path'), export=dict(type='bool', default=False), checkout=dict(type='bool', default=True), update=dict(type='bool', default=True), switch=dict(type='bool', default=True), in_place=dict(type='bool', default=False), validate_certs=dict(type='bool', default=False)), supports_check_mode=True)
        svn = Subversion(module, '/path/to/dest', 'svn+ssh://an.example.org/path/to/repo', 'HEAD', None, None, '/path/to/svn', False)
        self.assertEqual(svn.get_remote_revision(), '12345')

if __name__ == '__main__':
    unittest.main()