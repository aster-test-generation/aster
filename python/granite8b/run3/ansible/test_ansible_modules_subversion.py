import unittest
from ansible.modules.subversion import Subversion


class TestSubversion(unittest.TestCase):
    def test_checkout(self):
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
        svn = Subversion(module, dest, repo, revision, username, password, svn_path, validate_certs)
        if not export and (not checkout):
            self.assertFalse(svn.checkout())
        else:
            self.assertTrue(svn.checkout())

    def test_export(self):
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
        svn = Subversion(module, dest, repo, revision, username, password, svn_path, validate_certs)
        self.assertTrue(svn.export(force=force))

if __name__ == '__main__':
    unittest.main()